package mx.com.xoco.nuniez.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.SelectGenerator;

import javax.persistence.*;

@Entity
@Table(name = "edu_course")
@Data
public class EduCourse {

    @Id
/* TableGenerator - JPA - Initial approach */
//    @TableGenerator(
//            name = "course_gen",
//            table = "id_gen_table",
//            pkColumnName = "gen_key",
//            pkColumnValue = "edu_course_id",
//            valueColumnName = "gen_value",
//            allocationSize = 30
//    )
/* TableGenerator - JPA - full spec */
//    @TableGenerator(
//            name = "course_gen",
//            table = "cbs_api_sequences",
//            pkColumnName = "sequence_name",
//            pkColumnValue = "edu_course_id",
//            valueColumnName = "next_val",
//            allocationSize = 30
//    )
//    @GeneratedValue(strategy = GenerationType.TABLE, generator = "course_gen")
//    @TableGenerator(
//            name = "course_gen",
//            table = "sequence",
//            pkColumnName = "name",
//            pkColumnValue = "edu_course_id_seq_jvx",
//            valueColumnName = "cur_value",
//            allocationSize = 1
//    )
/* TableGenerator - JPA - min spec */
//    @TableGenerator(
//            name = "course_gen",
//            table = "cbs_api_course_sequences",
//            allocationSize = 30
//    )
/* SelectGenerator - id generated by trigger */
//    @GeneratedValue(generator = "triggered-by-db")
//    @GenericGenerator(
//            name = "triggered-by-db",
//            strategy = "select",
//            parameters = {
//                    @org.hibernate.annotations.Parameter(name = "key", value = "courseName")
//            }
//    )
/* SequenceStyleGenerator - like table generator spec */
//    @GeneratedValue(generator = "edu_course_id_seq_gen")
//    @GenericGenerator (
//            name = "edu_course_id_seq_gen",
//            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
//            parameters = {
//                    @org.hibernate.annotations.Parameter(name = "sequence_name", value = "sequence"),
//                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1"),
//                    @org.hibernate.annotations.Parameter(name = "force_table_use", value = "true"),
//                    @org.hibernate.annotations.Parameter(name = "value_column", value = "cur_value"),
//            }
//    )
/* SequenceStyleGenerator - like table generator spec v2 */
    @GeneratedValue(generator = "edu_course_id_seq_gen")
    @GenericGenerator (
            name = "edu_course_id_seq_gen",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "edu_course_id_seq"),
                    @Parameter(name = "initial_value", value = "5"),
                    @Parameter(name = "increment_size", value = "1"),
                    //@Parameter(name = "force_table_use", value = "true"),
                    //@Parameter(name = "value_column", value = "cur_val"),
                    @Parameter(name = "prefer_sequence_per_entity", value = "true"),
                    //@Parameter(name = "sequence_per_entity_suffix", value = "_seq"),
            }
    )
/* TableGenerator - HBNT */
//    @GeneratedValue(generator = "edu_course_id_seq_gen")
//    @GenericGenerator (
//            name = "edu_course_id_seq_gen",
//            strategy = "org.hibernate.id.enhanced.TableGenerator",
//            parameters = {
//                    @org.hibernate.annotations.Parameter(name = "table_name", value = "sequence"),
//                    @org.hibernate.annotations.Parameter(name = "segment_column_name", value = "name"),
//                    @org.hibernate.annotations.Parameter(name = "segment_value", value = "edu_course_id_seq"),
//                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1"),
//                    @org.hibernate.annotations.Parameter(name = "value_column_name", value = "cur_value"),
//            }
//    )
    private int id;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_duration")
    private int duration;
}
