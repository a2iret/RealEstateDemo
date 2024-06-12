package kg.megocom.RealEstate.controllers;

import kg.megocom.RealEstate.dto.AdDto;
import kg.megocom.RealEstate.models.*;
import kg.megocom.RealEstate.service.*;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1")
public class RealEstateController {
    private final RealEstateService realEstateService;
    private final DealTypeService dealTypeService;
    private final PropertyTypeService propertyTypeService;
    private final BuildingTypeService buildingTypeService;
    private final SeriesTypeService seriesTypeService;
    private final HeatingService heatingService;
    private final HouseComplexService houseComplexService;
    private final ConditionService conditionService;
    private final CountRoomService countRoomService;
    private final LocationService locationService;
    private final InstallmentPlanService installmentPlanService;
    private final MortgageService mortgageService;
    private final ExchangeOptionService exchangeOptionService;
    private final PriceTypeService priceTypeService;
    private final CurrencyService currencyService;


    @PostMapping("/real-estate/create")
    public ResponseEntity<String> realEstateCreate(Long dealType, Long propertyType, Integer countRoom,
                                                   Long houseComplex, Long seriesType,
                                                   Long buildingType, Long heating,
                                                   Long condition, Long location,
                                                   Long priceType, Long currency,
                                                   Long mortgage, Long installmentPlan,
                                                   Long exchangeOption, Integer yearBuild,
                                                   Integer floor, String houseNumber,
                                                   String streetName, BigDecimal price){
        return ResponseEntity.ok(realEstateService.createRealEstate(dealType, propertyType, countRoom,
                houseComplex, seriesType,buildingType, heating, condition, location, priceType, currency,
                mortgage,installmentPlan, exchangeOption, yearBuild, floor,
                houseNumber, streetName, price));
    }

    @GetMapping("/real-estate/listings")
    public ResponseEntity<List<AdDto>> realEstateListing(@RequestParam(required = false) String dealTypeName,
                                                         @RequestParam(required = false) String propertyTypeName, @RequestParam(required = false) Integer countRoom,
                                                         @RequestParam(required = false) String houseComplex, @RequestParam(required = false) String seriesType,
                                                         @RequestParam(required = false) String buildingType, @RequestParam(required = false) String heating,
                                                         @RequestParam(required = false) String condition, @RequestParam(required = false) String location,
                                                         @RequestParam(required = false) String priceType, @RequestParam(required = false) String currency,
                                                         @RequestParam(required = false) String mortgage, @RequestParam(required = false) String installmentPlan,
                                                         @RequestParam(required = false) String exchangeOption, @RequestParam(required = false) Integer yearBuild,
                                                         @RequestParam(required = false) Integer floor, @RequestParam(required = false) String houseNumber,
                                                         @RequestParam(required = false) String streetName, @RequestParam(required = false) BigDecimal price){

        return ResponseEntity.ok(realEstateService.getAllParameters(dealTypeName, propertyTypeName, countRoom, houseComplex, seriesType,buildingType,
                heating, condition, location, priceType, currency,mortgage,installmentPlan, exchangeOption, yearBuild, floor,
                houseNumber, streetName, price));
    }

    @GetMapping("/show-all/deal-type")
    public ResponseEntity<List<DealType>> getAllDealType() {
        return ResponseEntity.ok(dealTypeService.getAllDealType());
    }

    @GetMapping("/show-all/property-type")
    public ResponseEntity<List<PropertyType>> getAllProperties() {
        return ResponseEntity.ok(propertyTypeService.getAllProperties());
    }
    @GetMapping("/show-all/building-type")
    public ResponseEntity<List<BuildingType>> getAllBuildingType () {
        return ResponseEntity.ok(buildingTypeService.getAllBuildingTypes());
    }
    @GetMapping("/show-all/series-type")
    public ResponseEntity<List<SeriesType>> getAllSeriesType() {
        return ResponseEntity.ok(seriesTypeService.getAllSeriesType());
    }
    @GetMapping("/show-all/house-complexes")
    public ResponseEntity<List<HouseComplex>> getAllHouseComplexes(){
        return ResponseEntity.ok(houseComplexService.getAllHouseComplex());
    }
    @GetMapping("/show-all/heating")
    public ResponseEntity<List<Heating>> getAllHeating() {
        return ResponseEntity.ok(heatingService.getAllHeating());
    }
    @GetMapping("/show-all/condition")
    public ResponseEntity<List<Condition>> getAllCondition() {
        return ResponseEntity.ok(conditionService.getAllConditions());
    }

    @GetMapping("/show-all/count-room")
    public ResponseEntity<List<CountRoom>> getAllCountRoom() {
        return ResponseEntity.ok(countRoomService.getAllCountRooms());
    }
    @GetMapping("/show-all/location")
    public ResponseEntity<List<Location>> getAllLocation() {
        return ResponseEntity.ok(locationService.getAllLocations());
    }
    @GetMapping("/show-all/installment-plan")
    public ResponseEntity<List<InstallmentPlan>> getAllInstallmentPlan() {
        return ResponseEntity.ok(installmentPlanService.getAllInstallmentPlans());
    }
    @GetMapping("/show-all/mortgage")
    public ResponseEntity<List<Mortgage>> getAllMortgage() {
        return ResponseEntity.ok(mortgageService.getAllMortgages());
    }
    @GetMapping("/show-all/exchange-option")
    public ResponseEntity<List<ExchangeOption>> getAllExchangeOption() {
        return ResponseEntity.ok(exchangeOptionService.getAllExchangeProperties());
    }
    @GetMapping("/show-all/price-type")
    public ResponseEntity<List<PriceType>> getAllPriceType(){
        return ResponseEntity.ok(priceTypeService.getAllPriceType());
    }
    @GetMapping("/show-all/currencies")
    public ResponseEntity<List<Currency>> getAllCurrency(){
        return ResponseEntity.ok(currencyService.getAllcurrencies());
    }

}
