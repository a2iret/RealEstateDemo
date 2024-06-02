package kg.megocom.RealEstate.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "condition")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Condition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    @OneToMany(mappedBy = "condition")
    List<Ad> ads;
    boolean active;
}
