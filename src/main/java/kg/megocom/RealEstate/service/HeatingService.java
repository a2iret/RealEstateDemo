package kg.megocom.RealEstate.service;

import kg.megocom.RealEstate.models.Heating;
import kg.megocom.RealEstate.repository.HeatingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeatingService {

    private final HeatingRepository heatingRepository;

    public HeatingService(HeatingRepository heatingRepository) {
        this.heatingRepository = heatingRepository;
    }

    public List<Heating> getAllHeating() {
        return heatingRepository.findAll();
    }

}
