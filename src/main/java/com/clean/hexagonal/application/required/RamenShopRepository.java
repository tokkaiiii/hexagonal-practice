package com.clean.hexagonal.application.required;

import com.clean.hexagonal.domain.RamenShop;
import org.springframework.data.repository.Repository;

public interface RamenShopRepository extends Repository<RamenShop, Long> {

  RamenShop save(RamenShop ramenShop);
}
