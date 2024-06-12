package kg.megocom.RealEstate.repository;

import kg.megocom.RealEstate.models.DealType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DealTypeRepository extends JpaRepository<DealType, Long> {

    DealType findByName(String name);
}
