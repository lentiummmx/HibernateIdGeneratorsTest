package mx.com.xoco.nuniez.entities;

import lombok.Data;
import lombok.Setter;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Data
@MappedSuperclass
public abstract class AssignableIdentifierEntity<ID extends Serializable> extends BaseEntity<ID> {
    @Setter
    private ID id;

    @Override
    @Id
    @Access(AccessType.PROPERTY)
    public ID getId() {
        return id;
    }
}
