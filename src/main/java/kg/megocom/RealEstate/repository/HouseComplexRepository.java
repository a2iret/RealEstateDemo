package kg.megocom.RealEstate.repository;

import kg.megocom.RealEstate.models.HouseComplex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseComplexRepository extends JpaRepository<HouseComplex, Long> {
    HouseComplex findByName(String name);
}
