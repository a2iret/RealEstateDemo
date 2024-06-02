package kg.megocom.RealEstate.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ads")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "deal_type_id")
    DealType dealType;

    @ManyToOne
    @JoinColumn(name = "property_type_id")
    PropertyType propertyType;

    @ManyToOne
    @JoinColumn(name = "count_rooms_id")
    CountRoom countRoom;

    @ManyToOne
    @JoinColumn(name = "house_complex_id")
    HouseComplex houseComplex;

    @ManyToOne
    @JoinColumn(name = "series_type_id")
    SeriesType seriesType;

    @ManyToOne
    @JoinColumn(name = "building_type_id")
    BuildingType buildingType;

    @ManyToOne
    @JoinColumn(name = "heating_id")
    Heating heating;

    @ManyToOne
    @JoinColumn(name = "condition_id")
    Condition condition;

    @ManyToOne
    @JoinColumn(name = "location_id")
    Location location;

    @ManyToOne
    @JoinColumn(name = "price_id")
    PriceType priceType;

    @ManyToOne
    @JoinColumn(name = "currency_id")
    Currency currency;

    int yearBuild;
    int floor;
    String houseNumber;
    String streetName;

    @ManyToOne
    @JoinColumn(name = "mortgage_id")
    Mortgage mortgage;

    @ManyToOne
    @JoinColumn(name = "installment_plan_id")
    InstallmentPlan installmentPlan;

    @ManyToOne
    @JoinColumn(name = "exchange_plan_id")
    ExchangeOption exchangeOption;
}
