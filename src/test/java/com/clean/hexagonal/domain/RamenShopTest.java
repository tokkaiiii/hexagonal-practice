package com.clean.hexagonal.domain;

import static com.clean.hexagonal.domain.RamenShopStatus.OPEN;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.util.ReflectionTestUtils.getField;

import java.time.LocalTime;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RamenShopTest {

  @DisplayName("라멘샵을 등록할 수 있다")
  @Test
  void 라멘샵을_등록할_수_있다() {
    // Arrange
    String name = "Ramen Heaven";
    String address = "123 Ramen St.";
    LocalTime openingTime = LocalTime.of(11, 0);
    LocalTime closingTime = LocalTime.of(22, 0);

    var registerRequest = new RamenShopRegisterRequest(
        name,
        address,
        openingTime,
        closingTime
    );

    // Act
    RamenShop actual = RamenShop.register(registerRequest);

    // Assert
    assertThat(getField(actual, "name")).isEqualTo(name);
    assertThat(getField(actual, "address")).isEqualTo(address);
    assertThat(getField(actual, "openingTime")).isEqualTo(openingTime);
    assertThat(getField(actual, "closingTime")).isEqualTo(closingTime);
    assertThat(getField(actual, "status")).isEqualTo(OPEN);
  }

}