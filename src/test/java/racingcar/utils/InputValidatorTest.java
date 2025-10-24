package racingcar.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputValidatorTest {

    @DisplayName("이동횟수가 양수가 아닐 시 예외발생")
    @Test
    void test_validateIsPositive(){
        assertThatThrownBy(() -> InputValidator.validateGameRound("-5"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("이동횟수가 정수가 아닐 시 예외발생")
    @Test
    void test_convertToInt(){
        assertThatThrownBy(() -> InputValidator.validateGameRound("4.5"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("유효한 시도 횟수일 시 통과")
    @Test
    void test_validateGameRound(){
        int number = InputValidator.validateGameRound("5");
        assertThat(number).isEqualTo(5);
    }
}