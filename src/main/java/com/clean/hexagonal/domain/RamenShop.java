package com.clean.hexagonal.domain;

import static com.clean.hexagonal.domain.RamenShopStatus.OPEN;

import java.time.LocalTime;

public class RamenShop {

  private String name;
  private String address;
  private RamenShopStatus status;
  private LocalTime openingTime;
  private LocalTime closingTime;

  public static RamenShop register(
      String name,
      String address,
      LocalTime openingTime,
      LocalTime closingTime
  ) {
    RamenShop ramenShop = new RamenShop();
    ramenShop.name = name;
    ramenShop.address = address;
    ramenShop.openingTime = openingTime;
    ramenShop.closingTime = closingTime;

    ramenShop.status = OPEN;

    return ramenShop;
  }
}
