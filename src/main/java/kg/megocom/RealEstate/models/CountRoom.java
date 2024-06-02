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
@Table(name = "count_rooms")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CountRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int count;

    @OneToMany(mappedBy = "countRoom")
    List<Ad> ads;
    boolean active;
}
