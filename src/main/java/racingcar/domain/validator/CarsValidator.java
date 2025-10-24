package racingcar.domain.validator;

import racingcar.domain.Car;

import java.util.HashSet;
import java.util.List;

public class CarsValidator {
    public static void validateDuplicateName(List<String> list){
        if (list.size() != new HashSet<>(list).size()){
            throw new IllegalArgumentException("[ERROR] 중복된 이름은 사용할 수 없습니다.");
        }
    }
}