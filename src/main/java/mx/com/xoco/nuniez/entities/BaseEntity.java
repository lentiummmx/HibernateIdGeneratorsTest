package mx.com.xoco.nuniez.entities;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
@Access(AccessType.FIELD)
public abstract class BaseEntity <ID extends Serializable> implements Serializable {

    @Getter
    @Column(name = "creation_time", updatable=false)
    private Timestamp creationTime;

    @Getter
    @Column(name = "modification_time")
    private Timestamp modificationTime;

    @Getter
    @Version
    private int version;

    public abstract ID getId();
    public abstract void setId(ID id);

    @PreUpdate
    public final void preUpdate() {
        modificationTime = new Timestamp(System.currentTimeMillis());
    }

    @PrePersist
    public final void prePersist() {
        creationTime = new Timestamp(System.currentTimeMillis());
        modificationTime = new Timestamp(System.currentTimeMillis());
    }

}
