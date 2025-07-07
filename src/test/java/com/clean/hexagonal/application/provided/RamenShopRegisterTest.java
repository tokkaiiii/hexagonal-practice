package com.clean.hexagonal.application.provided;

import static com.clean.hexagonal.domain.RamenShopStatus.OPEN;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.util.ReflectionTestUtils.getField;

import com.clean.hexagonal.domain.RamenShop;
import com.clean.hexagonal.domain.RamenShopRegisterRequest;
import java.time.LocalTime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RamenShopRegisterTest {

  @Test
  void 라멘맛집을_등록한다(
      @Autowired RamenShopRegister ramenShopRegister
  ) {
    // Arrange
    var registerRequest = new RamenShopRegisterRequest(
        "Ramen Heaven",
        "123 Ramen St.",
        LocalTime.of(11, 0), // Opening time
        LocalTime.of(22, 0)  // Closing time
    );

    // Act
    RamenShop actual = ramenShopRegister.register(registerRequest);

    // Assert
    assertThat(actual).isNotNull();
    assertThat(getField(actual,"name")).isEqualTo(registerRequest.name());
    assertThat(getField(actual,"address")).isEqualTo(registerRequest.address());
    assertThat(getField(actual,"openingTime")).isEqualTo(registerRequest.openingTime());
    assertThat(getField(actual,"closingTime")).isEqualTo(registerRequest.closingTime());
    assertThat(getField(actual,"status")).isEqualTo(OPEN);
  }

}