package mx.com.xoco.nuniez.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.UUID;

@Entity(name = "info_line")
@GenericGenerator(name = "extendable-generator", strategy = "uuid2")
@AttributeOverride(name = "id", column = @Column(columnDefinition = "BINARY(16)"))
public class InfoLine extends GenericGeneratorIdentifierEntity<UUID> {
}
