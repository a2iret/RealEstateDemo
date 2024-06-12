package kg.megocom.RealEstate.service;


import jakarta.persistence.criteria.Root;
import kg.megocom.RealEstate.dto.AdDto;
import kg.megocom.RealEstate.models.*;
import kg.megocom.RealEstate.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Join;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RealEstateService {
    private final AdRepository adRepository;
    private final DealTypeRepository dealTypeRepository;
    private final PropertyTypeRepository propertyTypeRepository;
    private final CountRoomRepository countRoomRepository;
    private final HouseComplexRepository houseComplexRepository;
    private final SeriesTypeRepository seriesTypeRepository;
    private final BuildingTypeRepository buildingTypeRepository;
    private final HeatingRepository heatingRepository;
    private final ConditionRepository conditionRepository;
    private final LocationRepository locationRepository;
    private final PriceTypeRepository priceTypeRepository;
    private final CurrencyRepository currencyRepository;
    private final MortgageRepository mortgageRepository;
    private final InstallmentPlanRepository installmentPlanRepository;
    private final ExchangeOptionRepository exchangeOptionRepository;

    /*public String createRealEstate(String dealTypeName, String propertyTypeName, Integer countRoom,
                                   String houseComplex, String seriesType,
                                   String buildingTypeName, String heatingName,
                                   String conditionName, String locationName,
                                   String priceTypeName, String currencyName,
                                   String mortgageName, String installmentPlanName,
                                   String exchangeOptionName, Integer yearBuild,
                                   Integer floor, String houseNumber,
                                   String streetName, BigDecimal price){

        Ad ad = new Ad().setDealType(dealTypeRepository.findByName(dealTypeName))
                .setPropertyType(propertyTypeRepository.findByName(propertyTypeName))
                .setCountRoom(countRoomRepository.findByCount(countRoom))
                .setHouseComplex(houseComplexRepository.findByName(houseComplex))
                .setSeriesType(seriesTypeRepository.findByName(seriesType))
                .setBuildingType(buildingTypeRepository.findByName(buildingTypeName))
                .setHeating(heatingRepository.findByName(heatingName))
                .setCondition(conditionRepository.findByName(conditionName))
                .setLocation(locationRepository.findByName(locationName))
                .setPriceType(priceTypeRepository.findByName(priceTypeName))
                .setCurrency(currencyRepository.findByName(currencyName))
                .setMortgage(mortgageRepository.findByName(mortgageName))
                .setInstallmentPlan(installmentPlanRepository.findByName(installmentPlanName))
                .setExchangeOption(exchangeOptionRepository.findByName(exchangeOptionName))
                .setYearBuild(yearBuild)
                .setFloor(floor).setHouseNumber(houseNumber)
                .setStreetName(streetName)
                .setPrice(price);

        Ad savedAd = adRepository.save(ad);
        return "";
    }*/
    public String createRealEstate( Long dealType, Long propertyTypeName, Integer countRoom,
                                   Long houseComplex, Long seriesType,
                                   Long buildingTypeName, Long heatingName,
                                   Long conditionName, Long locationName,
                                   Long priceTypeName, Long currencyName,
                                   Long mortgageName, Long installmentPlanName,
                                   Long exchangeOptionName, Integer yearBuild,
                                   Integer floor, String houseNumber,
                                   String streetName, BigDecimal price){

        Ad ad = new Ad().setDealType(dealTypeRepository.getReferenceById(dealType))
                .setPropertyType(propertyTypeRepository.getReferenceById(propertyTypeName))
                .setCountRoom(countRoomRepository.findByCount(countRoom))
                .setHouseComplex(houseComplexRepository.getReferenceById(houseComplex))
                .setSeriesType(seriesTypeRepository.getReferenceById(seriesType))
                .setBuildingType(buildingTypeRepository.getReferenceById(buildingTypeName))
                .setHeating(heatingRepository.getReferenceById(heatingName))
                .setCondition(conditionRepository.getReferenceById(conditionName))
                .setLocation(locationRepository.getReferenceById(locationName))
                .setPriceType(priceTypeRepository.getReferenceById(priceTypeName))
                .setCurrency(currencyRepository.getReferenceById(currencyName))
                .setMortgage(mortgageRepository.getReferenceById(mortgageName))
                .setInstallmentPlan(installmentPlanRepository.getReferenceById(installmentPlanName))
                .setExchangeOption(exchangeOptionRepository.getReferenceById(exchangeOptionName))
                .setYearBuild(yearBuild)
                .setFloor(floor).setHouseNumber(houseNumber)
                .setStreetName(streetName)
                .setPrice(price);

        Ad savedAd = adRepository.save(ad);
        return "";}

    public List<AdDto> getAllParameters(String dealTypeName, String propertyTypeName, Integer countRoom,
                                        String houseComplex, String seriesType,
                                        String buildingType, String heating,
                                        String condition, String location,
                                        String priceType, String currency,
                                        String mortgage, String installmentPlan,
                                        String exchangeOption, Integer yearBuild,
                                        Integer floor, String houseNumber,
                                        String streetName, BigDecimal price) {
        Specification<Ad> adSpecification = (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = buildPredicates( dealTypeName, propertyTypeName, countRoom,
                     houseComplex, seriesType,
                     buildingType, heating,
                     condition, location,
                     priceType, currency,
                     mortgage, installmentPlan,
                     exchangeOption, yearBuild,
                     floor,houseNumber,
                     streetName, price, root, criteriaBuilder);
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
        List<Ad> ads = adRepository.findAll(adSpecification);
        return ads.stream().map(ad -> new AdDto(ad.getId(),ad.getDealType().getName(), ad.getPropertyType().getName(),
                ad.getCountRoom().getCount(),
                ad.getHouseComplex().getName(),
                ad.getSeriesType().getName(),
                ad.getBuildingType().getName(),
                ad.getHeating().getName(),
                ad.getCondition().getName(),
                ad.getLocation().getName(),
                ad.getPriceType().getName(),
                ad.getCurrency().getName(),
                ad.getMortgage().getName(),
                ad.getInstallmentPlan().getName(),
                ad.getExchangeOption().getName(),
                ad.getYearBuild(),
                ad.getFloor(),
                ad.getHouseNumber(),
                ad.getStreetName(),
                ad.getPrice())).collect(Collectors.toList());
    }

    private List<Predicate> buildPredicates(String dealTypeName, String propertyTypeName, Integer countRoom,
                                            String houseComplex,
                                            String seriesType, String buildingType,
                                            String heating, String condition,
                                            String location, String priceType,
                                            String currency, String mortgage,
                                            String installmentPlan, String exchangeOption,
                                            Integer yearBuild, Integer floor,
                                            String houseNumber, String streetName,
                                            BigDecimal price, Root<Ad> root, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new ArrayList<>();
        if (price != null) {predicates.add(criteriaBuilder.equal(root.get("price"), price));}

        if (yearBuild != null){predicates.add(criteriaBuilder.equal(root.get("yearBuild"), yearBuild));}

        if (floor != null){predicates.add(criteriaBuilder.equal(root.get("floor"), floor));}

        if (houseNumber != null){predicates.add(criteriaBuilder.equal(root.get("houseNumber"), houseNumber));}

        if (streetName != null){predicates.add(criteriaBuilder.equal(root.get("streetName"), streetName));}

        if (dealTypeName != null) {
            Join<Ad, DealType> join = root.join("dealType");
            predicates.add(criteriaBuilder.equal(join.get("name"), dealTypeName));
        }
        if (dealTypeName != null) {
            Join<Ad, PropertyType> join = root.join("propertyType");
            predicates.add(criteriaBuilder.equal(join.get("name"), propertyTypeName));
        }
        if (countRoom != null) {
            Join<Ad, CountRoom> join = root.join("countRoom");
            predicates.add(criteriaBuilder.equal(join.get("count"), countRoom));
        }
        if (houseComplex != null) {
            Join<Ad, HouseComplexService> join = root.join("houseComplex");
            predicates.add(criteriaBuilder.equal(join.get("name"), houseComplex));
        }
        if (seriesType != null) {
            Join<Ad, SeriesType> join = root.join("seriesType");
            predicates.add(criteriaBuilder.equal(join.get("name"), seriesType));
        }
        if (buildingType != null) {
            Join<Ad, BuildingType> join = root.join("buildingType");
            predicates.add(criteriaBuilder.equal(join.get("name"), buildingType));
        }
        if (heating != null) {
            Join<Ad, Heating> join = root.join("heating");
            predicates.add(criteriaBuilder.equal(join.get("name"), heating));
        }
        if (condition != null) {
            Join<Ad, Condition> join = root.join("condition");
            predicates.add(criteriaBuilder.equal(join.get("name"), condition));
        }
        if (location != null) {
            Join<Ad, Location> join = root.join("location");
            predicates.add(criteriaBuilder.equal(join.get("name"), location));
        }
        if (priceType != null) {
            Join<Ad, PriceType> join = root.join("priceType");
            predicates.add(criteriaBuilder.equal(join.get("name"), priceType));
        }
        if (currency != null) {
            Join<Ad, Currency> join = root.join("currency");
            predicates.add(criteriaBuilder.equal(join.get("name"), currency));
        }
        if (mortgage != null) {
            Join<Ad, Mortgage> join = root.join("mortgage");
            predicates.add(criteriaBuilder.equal(join.get("name"), mortgage));
        }
        if (installmentPlan != null) {
            Join<Ad, InstallmentPlan> join = root.join("installmentPlan");
            predicates.add(criteriaBuilder.equal(join.get("name"), installmentPlan));
        }
        if (exchangeOption != null) {
            Join<Ad, ExchangeOption> join = root.join("exchangeOption");
            predicates.add(criteriaBuilder.equal(join.get("name"), exchangeOption));
        }
        return predicates;
    }
}
