package racingcar.utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InputValidator {
    public static List<String> validateCarNames(String CarNamesStr){
        List<String> carNames = convertToList(CarNamesStr);
        validateIsEmpty(carNames);
        validateNameLength(carNames);
        validateDuplicateName(carNames);
        return carNames;
    }

    private static List<String> convertToList(String string){
        return Arrays.stream(string.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    private static void validateIsEmpty(List<String> list){
        for (String str : list){
            if (str.isEmpty()){
                throw new IllegalArgumentException("[ERROR] 빈 문자열은 이름이 될 수 없습니다.");
            }
        }
    }

    private static void validateNameLength(List<String> list){
        for (String str : list){
            if (str.length() > 5){
                throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하여야 합니다.");
            }
        }
    }

    private static void validateDuplicateName(List<String> list){
        if (list.size() != new HashSet<>(list).size()){
            throw new IllegalArgumentException("[ERROR] 중복된 이름은 사용할 수 없습니다.");
        }
    }
}
