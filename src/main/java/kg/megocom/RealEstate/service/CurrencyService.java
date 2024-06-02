package kg.megocom.RealEstate.service;

import kg.megocom.RealEstate.models.Currency;
import kg.megocom.RealEstate.repository.CurrencyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {
    private final CurrencyRepository currencyRepository;

    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public List<Currency> getAllcurrencies() {
        return currencyRepository.findAll();
    }
}
