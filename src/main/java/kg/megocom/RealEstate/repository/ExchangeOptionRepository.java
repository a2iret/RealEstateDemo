package kg.megocom.RealEstate.repository;

import kg.megocom.RealEstate.models.ExchangeOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeOptionRepository extends JpaRepository<ExchangeOption, Long> {
    ExchangeOption findByName(String name);
}
