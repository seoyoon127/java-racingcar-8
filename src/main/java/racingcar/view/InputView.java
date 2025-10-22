package racingcar.view;

import java.util.List;
import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.InputValidator;

public class InputView {
    static String CAR_NAMES_MSG = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    static String GAME_ROUND__MSG = "시도할 횟수는 몇 회인가요?";

    public List<String> readCarNames(){
        System.out.println(CAR_NAMES_MSG);
        String carNamesStr = Console.readLine();
        return InputValidator.validateCarNames(carNamesStr);
    }

    public int readGameRound(){
        System.out.println(GAME_ROUND__MSG);
        String gameRoundStr = Console.readLine();
        return InputValidator.validateGameRound(gameRoundStr);
    }
}
