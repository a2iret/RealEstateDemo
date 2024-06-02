package kg.megocom.RealEstate.repository;

import kg.megocom.RealEstate.models.PropertyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyTypeRepository extends JpaRepository<PropertyType, Long> {
}
