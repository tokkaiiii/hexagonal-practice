package com.clean.hexagonal.application;

import com.clean.hexagonal.application.provided.RamenShopRegister;
import com.clean.hexagonal.application.required.RamenShopRepository;
import com.clean.hexagonal.domain.RamenShop;
import com.clean.hexagonal.domain.RamenShopRegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RamenShopModifyService implements RamenShopRegister {

  private final RamenShopRepository ramenShopRepository;

  @Override
  public RamenShop register(RamenShopRegisterRequest registerRequest) {


    RamenShop ramenShop = RamenShop.register(registerRequest);
    return ramenShopRepository.save(ramenShop);
  }
}
