package racingcar.utils;

import java.util.List;

public class InputValidator {
    public static List<String> validateCarNames(String CarNamesStr){
        List<String> carNames = convertToList(CarNamesStr);
        return carNames;
    }

    private static List<String> convertToList(String string){
        return List.of(string.split(","));
    }
}
