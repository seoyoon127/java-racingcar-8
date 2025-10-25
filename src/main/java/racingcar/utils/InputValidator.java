package racingcar.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputValidator {
    private static final String NOT_INTEGER_ERROR_MSG = "[ERROR] 시도 횟수는 정수여야 합니다.";
    private static final String NOT_POSITIVE_ERROR_MSG = "[ERROR] 시도 횟수는 양수로 입력해주세요.";

    public static List<String> convertToList(String string){
        return Arrays.stream(string.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    public static int validateGameRound(String gameRoundStr){
        int gameRound = convertToInt(gameRoundStr);
        validateIsPositive(gameRound);
        return gameRound;
    }

    private static int convertToInt(String string){
        try{
            return Integer.parseInt(string);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException(NOT_INTEGER_ERROR_MSG);
        }
    }

    private static void validateIsPositive(int number){
        if (number <= 0){
            throw new IllegalArgumentException(NOT_POSITIVE_ERROR_MSG);
        }
    }
}
