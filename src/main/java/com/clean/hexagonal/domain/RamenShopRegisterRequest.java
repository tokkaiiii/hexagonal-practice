package com.clean.hexagonal.domain;

import java.time.LocalTime;

public record RamenShopRegisterRequest(
    String name,
    String address,
    LocalTime openingTime,
    LocalTime closingTime
) {

}
