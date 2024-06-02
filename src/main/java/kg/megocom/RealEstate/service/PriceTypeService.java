package kg.megocom.RealEstate.service;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import kg.megocom.RealEstate.models.PriceType;
import kg.megocom.RealEstate.repository.PriceTypeRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceTypeService {
    private final PriceTypeRepository priceTypeRepository;

    public PriceTypeService(PriceTypeRepository priceTypeRepository){
        this.priceTypeRepository = priceTypeRepository;
    }

    public List<PriceType>getAllPriceType(){
        return priceTypeRepository.findAll();
    }
}
