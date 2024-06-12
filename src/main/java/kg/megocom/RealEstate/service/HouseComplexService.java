package kg.megocom.RealEstate.service;

import kg.megocom.RealEstate.models.DealType;
import kg.megocom.RealEstate.models.HouseComplex;
import kg.megocom.RealEstate.repository.HouseComplexRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseComplexService {
    private final HouseComplexRepository houseComplexRepository;

    public HouseComplexService(HouseComplexRepository houseComplexRepository) {
        this.houseComplexRepository = houseComplexRepository;
    }

    public List<HouseComplex> getAllHouseComplex() {
        return houseComplexRepository.findAll();
    }
}
