package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    @DisplayName("우승자를 구하는 기능 테스트")
    @Test
    void getWinners_test(){
        assertRandomNumberInRangeTest(
                () -> {
                    Cars cars = new Cars(List.of("pobi", "woni", "lee"));
                    for (Car car: cars.getCarList()){
                        car.move();
                    }
                    assertThat(cars.getWinners()).isEqualTo(List.of("woni","lee"));
                },
                3,4,5
        );
    }

}