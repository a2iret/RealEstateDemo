package kg.megocom.RealEstate.service;

import kg.megocom.RealEstate.models.ExchangeOption;
import kg.megocom.RealEstate.repository.ExchangeOptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeOptionService {
    private final ExchangeOptionRepository exchangeOptionRepository;

    public ExchangeOptionService(ExchangeOptionRepository exchangeOptionRepository) {
        this.exchangeOptionRepository = exchangeOptionRepository;
    }

    public List<ExchangeOption> getAllExchangeProperties() {
        return exchangeOptionRepository.findAll();
    }

}
