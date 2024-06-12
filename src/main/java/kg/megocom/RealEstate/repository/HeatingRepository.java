package kg.megocom.RealEstate.repository;

import kg.megocom.RealEstate.models.Heating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeatingRepository extends JpaRepository<Heating, Long> {
    Heating findByName(String name);
}
