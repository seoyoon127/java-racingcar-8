package racingcar.domain.validator;

import java.util.HashSet;
import java.util.List;

public class CarsValidator {
    private static final String DUPLICATE_ERROR_MSG = "[ERROR] 중복된 이름은 사용할 수 없습니다.";

    public static void validateDuplicateName(List<String> list){
        if (list.size() != new HashSet<>(list).size()){
            throw new IllegalArgumentException(DUPLICATE_ERROR_MSG);
        }
    }
}