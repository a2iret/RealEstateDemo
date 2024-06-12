package kg.megocom.RealEstate.service;

import kg.megocom.RealEstate.models.CurrencyRate;
import kg.megocom.RealEstate.repository.CurrencyRateRepository;
import org.springframework.stereotype.Service;

@Service
public class CurrencyRateService {
    private final CurrencyRateRepository currencyRateRepository;

    public CurrencyRateService(CurrencyRateRepository currencyRateRepository) {
        this.currencyRateRepository = currencyRateRepository;
    }

    public String createCurrencyRate(double rate){
        CurrencyRate currencyRate = new CurrencyRate();
        return "";
    }
}
