package mx.com.xoco.nuniez.entities;

import javax.persistence.*;

@Entity
@Table(name = "id_strategy_course")
//public class IdStrategyCourse  extends BaseCourse {
public class IdStrategyCourse  extends NoIdBaseCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
}
