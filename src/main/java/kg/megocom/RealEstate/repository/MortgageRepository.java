package kg.megocom.RealEstate.repository;

import kg.megocom.RealEstate.models.Mortgage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MortgageRepository extends JpaRepository<Mortgage, Long> {

}
