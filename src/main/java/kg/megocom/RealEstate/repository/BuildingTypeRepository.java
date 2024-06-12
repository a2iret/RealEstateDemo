package kg.megocom.RealEstate.repository;

import kg.megocom.RealEstate.models.BuildingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingTypeRepository extends JpaRepository<BuildingType, Long> {
    BuildingType findByName(String name);
}
