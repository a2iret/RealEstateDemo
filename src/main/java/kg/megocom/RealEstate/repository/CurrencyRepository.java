package kg.megocom.RealEstate.repository;

import kg.megocom.RealEstate.models.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
    Currency findByName(String name);
}
