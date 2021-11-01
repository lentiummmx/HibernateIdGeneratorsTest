package mx.com.xoco.nuniez.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity(name = "info_id")
@AttributeOverride(name = "id", column = @Column(columnDefinition = "BINARY(16)"))
public class InfoId extends GenericGeneratorIdentifierEntity<UUID> {
}
