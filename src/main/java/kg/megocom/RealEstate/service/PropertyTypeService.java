package kg.megocom.RealEstate.service;

import kg.megocom.RealEstate.models.PropertyType;
import kg.megocom.RealEstate.repository.PropertyTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyTypeService {
    private final PropertyTypeRepository propertyTypeRepository;

    public PropertyTypeService(PropertyTypeRepository propertyTypeRepository) {
        this.propertyTypeRepository = propertyTypeRepository;
    }

    public List<PropertyType> getAllProperties() {
        return propertyTypeRepository.findAll();
    }

}
