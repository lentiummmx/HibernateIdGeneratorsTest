package mx.com.xoco.nuniez.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.UUID;

@Entity(name = "order_line")
@AttributeOverride(name = "id", column = @Column(columnDefinition = "BINARY(16)"))
public class Order extends AssignableIdentifierEntity<UUID> {
    @Override
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    public UUID getId() {
        return super.getId();
    }
}
