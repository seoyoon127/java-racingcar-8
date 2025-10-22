package racingcar.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputValidatorTest {
    static String emptyInput;
    static String lengthOverInput;
    static String duplicateInput;
    static String validInput;

    @BeforeEach
    void setup(){
        emptyInput = "pobi, woni,  ";
        lengthOverInput = "pobi, woni, leeseo";
        duplicateInput = "pobi, pobi, woni";
        validInput = "pobi, woni, lee";
    }

    @DisplayName("빈 문자열일 시 예외발생")
    @Test
    void test_convertToList(){
        assertThatThrownBy(() -> InputValidator.validateCarNames(emptyInput))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("이름이 5자 이하일 시 예외발생")
    @Test
    void test_validateIsEmpty(){
        assertThatThrownBy(() -> InputValidator.validateCarNames(lengthOverInput))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("이름이 중복일 시 예외발생")
    @Test
    void test_validateNameLength(){
        assertThatThrownBy(() -> InputValidator.validateCarNames(duplicateInput))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("유효한 문자열일 시 통과")
    @Test
    void test_validateCarNames(){
        List<String> list = InputValidator.validateCarNames(validInput);
        assertThat(list).isEqualTo(List.of("pobi", "woni", "lee"));
    }

    @DisplayName("이동횟수가 양수가 아닐 시 예외발생")
    @Test
    void test_validateIsPositive(){
        assertThatThrownBy(() -> InputValidator.validateGameRound("-5"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("유효한 시도 횟수일 시 통과")
    @Test
    void test_validateGameRound(){
        int number = InputValidator.validateGameRound("5");
        assertThat(number).isEqualTo(5);
    }
}