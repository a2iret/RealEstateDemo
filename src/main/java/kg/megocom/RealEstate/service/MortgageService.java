package kg.megocom.RealEstate.service;

import kg.megocom.RealEstate.models.Mortgage;
import kg.megocom.RealEstate.repository.MortgageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MortgageService {
    private final MortgageRepository mortgageRepository;

    public MortgageService(MortgageRepository mortgageRepository) {
        this.mortgageRepository = mortgageRepository;
    }

    public List<Mortgage> getAllMortgages() {
        return mortgageRepository.findAll();
    }

}
