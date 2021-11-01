package mx.com.xoco.nuniez.entities;

import lombok.Data;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity(name = "book")
@AttributeOverride(name = "id", column = @Column(name = "isbn", length = 13))
public class Book extends AssignableIdentifierEntity<Long> {
    String title;
}
