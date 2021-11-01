package mx.com.xoco.nuniez;

import mx.com.xoco.nuniez.config.HibernateUtil;
import mx.com.xoco.nuniez.entities.*;
import org.hibernate.Session;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Session session = HibernateUtil.getSession();

        session.beginTransaction();

        EduCourse course = new EduCourse();
        course.setCourseName("a1s2 d3f4 g5h6");
        course.setDuration(37);
        //session.save(course);
        System.out.println("course <> " + course);

        session.getTransaction().commit();

        /*===================================================================-*/

        session.beginTransaction();

        IdStrategyCourse idCourse = new IdStrategyCourse();
        idCourse.setCourseName("a1s2 d3f4 g5h6");
        idCourse.setDuration(37);
        session.save(idCourse);
        System.out.println("idCourse <> " + idCourse);

        session.getTransaction().commit();

        /*===================================================================-*/

        session.beginTransaction();

        SeqStrategyCourse seqCourse = new SeqStrategyCourse();
        seqCourse.setCourseName("a1s2 d3f4 g5h6");
        seqCourse.setDuration(37);
        session.save(seqCourse);
        System.out.println("seqCourse <> " + seqCourse);

        session.getTransaction().commit();

        /*===================================================================-*/

        session.beginTransaction();

        try {
            WebResource webResource = new WebResource();
            webResource.setId(new URL("http://vladmihalcea.com.org"));
            //session.persist(webResource);
            System.out.println("webResource <> " + webResource);
        } catch (MalformedURLException e) {
            System.err.println(e.getMessage());
        }

        session.getTransaction().commit();

        /*===================================================================-*/

        session.beginTransaction();

        Order order = new Order();
        session.persist(order);
        System.out.println("order <> " + order);

        session.getTransaction().commit();

        /*===================================================================-*/

        session.beginTransaction();

        Book book = new Book();
        book.setId(3456789012345L);
        book.setTitle("Qwerty Asdfgh Zxcvbn");
        session.persist(book);
        System.out.println("book <> " + book);

        session.getTransaction().commit();

        /*===================================================================-*/

        session.beginTransaction();

        InfoId infoId = new InfoId();
        //infoId.setId(UUID.randomUUID());
        session.persist(infoId);
        System.out.println("infoId <> " + infoId);

        session.getTransaction().commit();

        /*===================================================================-*/

        session.beginTransaction();

        InfoLine infoLine = new InfoLine();
        //infoId.setId(UUID.randomUUID());
        session.persist(infoLine);
        System.out.println("infoLine <> " + infoLine);

        session.getTransaction().commit();

        session.close();
    }


}
