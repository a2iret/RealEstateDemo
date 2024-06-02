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
@Table(name = "priceType")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PriceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    @OneToMany(mappedBy = "priceType")
    List<Ad> ads;
    boolean active;
}
