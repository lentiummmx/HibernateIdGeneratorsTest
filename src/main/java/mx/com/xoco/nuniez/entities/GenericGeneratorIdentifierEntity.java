package mx.com.xoco.nuniez.entities;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
public abstract class GenericGeneratorIdentifierEntity<ID extends Serializable> extends BaseEntity<ID> {

    @Id
    @GeneratedValue(generator = "extendable-generator")
    @GenericGenerator(name = "extendable-generator", strategy = "assigned")
    private ID id;

}
