package racingcar.domain.validator;

public class CarValidator {
    public static void validateCarName(String carName){
        validateIsEmpty(carName);
        validateNameLength(carName);
    }

    private static void validateIsEmpty(String carName){
        if (carName.isEmpty()){
            throw new IllegalArgumentException("[ERROR] 빈 문자열은 이름이 될 수 없습니다.");
        }
    }

    private static void validateNameLength(String carName){
        if (carName.length() > 5){
            throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하여야 합니다.");
        }
    }
}
