package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class GameController {
    private final InputView inputView;
    private final OutputView outputView;

    public GameController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run(){
        List<String> carNames = inputView.readCarNames();
        Cars cars = new Cars(carNames);

        int gameRound= inputView.readGameRound();

        outputView.printResultMsg();
        for (int i=0; i< gameRound; i++){
            printCarDistance(cars.getCarList());
        }

        outputView.printWinners(cars.getWinners());
    }

    private void printCarDistance(List<Car> carList){
        for (Car car : carList){
            car.move();
            outputView.printDistance(car.getName(), car.getDistance());
        }
        outputView.printEmptyLine();
    }
}
