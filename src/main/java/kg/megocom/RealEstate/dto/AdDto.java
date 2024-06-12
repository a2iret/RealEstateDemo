package kg.megocom.RealEstate.dto;

import kg.megocom.RealEstate.models.Ad;

import java.math.BigDecimal;

public record AdDto(Long id,
                    String dealTypeName,
                    String propertyTypeName,
                    Integer countRoom,
                    String houseComplexName,
                    String seriesTypeName,
                    String buildingTypeName,
                    String heatingName,
                    String conditionName,
                    String locationName,
                    String priceTypeName,
                    String currencyName,
                    String mortgageName,
                    String installmentPlanName,
                    String exchangeOptionName,
                    Integer yearBuild,
                    Integer floor,
                    String houseNumber,
                    String streetName,
                    BigDecimal price) {}

