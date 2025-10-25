package racingcar.domain.validator;

public class CarValidator {
    private static final String EMPTY_ERROR_MSG = "[ERROR] 빈 문자열은 이름이 될 수 없습니다.";
    private static final String LENGTH_ERROR_MSG = "[ERROR] 자동차 이름은 5자 이하여야 합니다.";

    public static void validateCarName(String carName){
        validateIsEmpty(carName);
        validateNameLength(carName);
    }

    private static void validateIsEmpty(String carName){
        if (carName.isEmpty()){
            throw new IllegalArgumentException(EMPTY_ERROR_MSG);
        }
    }

    private static void validateNameLength(String carName){
        if (carName.length() > 5){
            throw new IllegalArgumentException(LENGTH_ERROR_MSG);
        }
    }
}
