package kg.megocom.RealEstate.repository;

import kg.megocom.RealEstate.models.SeriesType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesTypeRepository extends JpaRepository<SeriesType, Long> {
}
