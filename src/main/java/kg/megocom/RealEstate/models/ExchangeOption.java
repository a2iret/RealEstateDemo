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
@Table(name = "exchange_options")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ExchangeOption {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;

    @OneToMany(mappedBy = "exchangeOption")
    List<Ad> ads;
    boolean active;
}
