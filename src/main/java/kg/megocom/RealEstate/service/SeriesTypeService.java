package kg.megocom.RealEstate.service;

import kg.megocom.RealEstate.models.SeriesType;
import kg.megocom.RealEstate.repository.SeriesTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesTypeService {
    private final SeriesTypeRepository seriesTypeRepository;

    public SeriesTypeService(SeriesTypeRepository seriesTypeRepository) {
        this.seriesTypeRepository = seriesTypeRepository;
    }

    public List<SeriesType> getAllSeriesType() {
        return seriesTypeRepository.findAll();
    }

}
