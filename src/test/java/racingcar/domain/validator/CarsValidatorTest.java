package racingcar.domain.validator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

class CarsValidatorTest {
    static List<String> duplicateInput;
    static List<String> validInput;

    @BeforeEach
    void setup(){
        duplicateInput = List.of("pobi", "woni", "pobi");
        validInput = List.of("pobi", "woni", "lee");
    }

    @DisplayName("이름이 중복일 시 예외발생")
    @Test
    void test_validateNameLength(){
        assertThatThrownBy(() -> CarsValidator.validateDuplicateName(duplicateInput))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("유효한 리스트일 시 통과")
    @Test
    void test_validateCars(){
        assertThatCode(() -> CarsValidator.validateDuplicateName(validInput))
                .doesNotThrowAnyException();
    }
}