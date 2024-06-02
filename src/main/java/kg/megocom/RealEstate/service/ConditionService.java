package kg.megocom.RealEstate.service;

import kg.megocom.RealEstate.models.Condition;
import kg.megocom.RealEstate.repository.ConditionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConditionService {
    private final ConditionRepository conditionRepository;

    public ConditionService(ConditionRepository conditionRepository) {
        this.conditionRepository = conditionRepository;
    }

    public List<Condition> getAllConditions() {
        return conditionRepository.findAll();
    }

}
