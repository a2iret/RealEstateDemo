package kg.megocom.RealEstate.service;

import kg.megocom.RealEstate.models.DealType;
import kg.megocom.RealEstate.repository.DealTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DealTypeService {
    private final DealTypeRepository dealTypeRepository;

    public DealTypeService(DealTypeRepository dealType) {
        this.dealTypeRepository = dealType;
    }

    public List<DealType> getAllDealType() {
        return dealTypeRepository.findAll();
    }
}
