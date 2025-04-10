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
@Table(name = "house_complexes")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class HouseComplex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    @OneToMany(mappedBy = "houseComplex")
    List<Ad> ads;
    boolean active;
}
