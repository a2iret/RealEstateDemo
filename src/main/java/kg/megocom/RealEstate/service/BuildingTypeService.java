package kg.megocom.RealEstate.service;

import kg.megocom.RealEstate.models.BuildingType;
import kg.megocom.RealEstate.repository.BuildingTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingTypeService {
    private final BuildingTypeRepository buildingTypeRepository;

    public BuildingTypeService(BuildingTypeRepository buildingTypeRepository) {
        this.buildingTypeRepository = buildingTypeRepository;
    }

    public List<BuildingType> getAllBuildingTypes() {
        return buildingTypeRepository.findAll();
    }

}
