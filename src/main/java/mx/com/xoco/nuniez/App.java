package mx.com.xoco.nuniez;

import mx.com.xoco.nuniez.config.HibernateUtil;
import mx.com.xoco.nuniez.entities.EduCourse;
import org.hibernate.Session;

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
        course.setCourseName("Qwerty");
        course.setDuration(15);
        session.save(course);
        System.out.println(course);

        session.getTransaction().commit();
        session.close();
    }
}
