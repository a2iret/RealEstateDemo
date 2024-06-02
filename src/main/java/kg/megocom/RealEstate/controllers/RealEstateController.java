package kg.megocom.RealEstate.controllers;

import kg.megocom.RealEstate.models.*;
import kg.megocom.RealEstate.service.*;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1")
public class RealEstateController {
    private final DealTypeService dealTypeService;
    private final PropertyTypeService propertyTypeService;
    private final BuildingTypeService buildingTypeService;
    private final SeriesTypeService seriesTypeService;
    private final HeatingService heatingService;
    private final ConditionService conditionService;
    private final CountRoomService countRoomService;
    private final LocationService locationService;
    private final InstallmentPlanService installmentPlanService;
    private final MortgageService mortgageService;
    private final ExchangeOptionService exchangeOptionService;
    private final PriceTypeService priceTypeService;
    private final CurrencyService currencyService;


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
