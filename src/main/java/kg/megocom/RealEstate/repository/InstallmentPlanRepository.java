package kg.megocom.RealEstate.repository;

import kg.megocom.RealEstate.models.InstallmentPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstallmentPlanRepository extends JpaRepository<InstallmentPlan, Long> {
    InstallmentPlan findByName(String name);
}
