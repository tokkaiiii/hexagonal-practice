package com.clean.hexagonal.domain;

import static com.clean.hexagonal.domain.RamenShopStatus.OPEN;

import jakarta.persistence.Entity;
import java.time.LocalTime;

@Entity
public class RamenShop extends AbstractEntity{

  private String name;

  private String address;


  private RamenShopStatus status;

  private LocalTime openingTime;

  private LocalTime closingTime;

  public static RamenShop register(
     RamenShopRegisterRequest registerRequest
  ) {
    RamenShop ramenShop = new RamenShop();
    ramenShop.name = registerRequest.name();
    ramenShop.address = registerRequest.address();
    ramenShop.openingTime = registerRequest.openingTime();
    ramenShop.closingTime = registerRequest.closingTime();

    ramenShop.status = OPEN;

    return ramenShop;
  }
}
