package mx.com.xoco.nuniez.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seq_strategy_course")
//public class SeqStrategyCourse extends BaseCourse {
public class SeqStrategyCourse extends NoIdBaseCourse {
    @Id
    @GeneratedValue(generator = "seq_strategy_course_id_seq_gen")
    @GenericGenerator(
            name = "seq_strategy_course_id_seq_gen",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "seq_strategy_course_id_seq"),
                    @Parameter(name = "initial_value", value = "5"),
                    @Parameter(name = "increment_size", value = "1"),
                    //@Parameter(name = "force_table_use", value = "true"),
                    //@Parameter(name = "value_column", value = "cur_val"),
                    @Parameter(name = "prefer_sequence_per_entity", value = "true"),
                    //@Parameter(name = "sequence_per_entity_suffix", value = "_seq"),
            }
    )
    private int id;
}
