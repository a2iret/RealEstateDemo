package kg.megocom.RealEstate.service;

import kg.megocom.RealEstate.models.InstallmentPlan;
import kg.megocom.RealEstate.repository.InstallmentPlanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstallmentPlanService {
    private final InstallmentPlanRepository installmentPlanRepository;

    public InstallmentPlanService(InstallmentPlanRepository installmentPlanRepository) {
        this.installmentPlanRepository = installmentPlanRepository;
    }

    public List<InstallmentPlan> getAllInstallmentPlans() {
        return installmentPlanRepository.findAll();
    }

}
