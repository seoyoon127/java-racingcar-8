package racingcar.view;

import java.util.List;

public class OutputView {
    static String RESULT_PRINT_MSG = "실행 결과";
    static String WINNERS_MEG = "최종 우승자 : ";

    public void printResultMsg(){
        System.out.println(RESULT_PRINT_MSG);
    }

    public void printDistance(String name, int distance){
        System.out.println(name + " : " + "-".repeat(distance));
    }

    public void printEmptyLine(){
        System.out.println();
    }

    public void printWinners(List<String> winnerList){
        System.out.println(WINNERS_MEG + String.join(",", winnerList));
    }
}