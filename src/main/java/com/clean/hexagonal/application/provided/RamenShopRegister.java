package com.clean.hexagonal.application.provided;

import com.clean.hexagonal.domain.RamenShop;
import com.clean.hexagonal.domain.RamenShopRegisterRequest;

public interface RamenShopRegister {

  RamenShop register(RamenShopRegisterRequest ramenShopRegisterRequest);

}
