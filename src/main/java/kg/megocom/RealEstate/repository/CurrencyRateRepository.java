package kg.megocom.RealEstate.repository;

import kg.megocom.RealEstate.models.CurrencyRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRateRepository extends JpaRepository<CurrencyRate, Long> {
}
