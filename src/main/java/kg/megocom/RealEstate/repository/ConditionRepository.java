package kg.megocom.RealEstate.repository;

import kg.megocom.RealEstate.models.Condition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConditionRepository extends JpaRepository<Condition, Long> {
    Condition findByName(String name);
}
