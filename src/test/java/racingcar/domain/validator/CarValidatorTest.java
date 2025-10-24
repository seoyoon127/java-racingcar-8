package racingcar.domain.validator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

class CarValidatorTest {
    static String emptyInput;
    static String lengthOverInput;
    static String validInput;

    @BeforeEach
    void setup(){
        emptyInput = "";
        lengthOverInput = "leeseo";
        validInput = "lee";
    }

    @DisplayName("빈 문자열일 시 예외발생")
    @Test
    void test_convertToList(){
        System.out.println("ei: " + emptyInput + emptyInput.length());
        assertThatThrownBy(() -> CarValidator.validateCarName(emptyInput))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("이름이 5자 이하일 시 예외발생")
    @Test
    void test_validateIsEmpty(){
        assertThatThrownBy(() -> CarValidator.validateCarName(lengthOverInput))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("유효한 리스트일 시 통과")
    @Test
    void test_validateCars(){
        assertThatCode(() -> CarValidator.validateCarName(validInput))
                .doesNotThrowAnyException();
    }
}