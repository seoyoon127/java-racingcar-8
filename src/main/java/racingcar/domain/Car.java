package racingcar.domain;

import racingcar.domain.validator.CarValidator;
import racingcar.utils.RandomNumber;

public class Car {
    private String name;
    private int distance;
    private RandomNumber randomNumber;

    public Car(String name){
        CarValidator.validateCarName(name.trim());
        this.name = name.trim();
        distance = 0;
        randomNumber = new RandomNumber();
    }

    public void move(){
        if (randomNumber.generate() >= 4){
            distance ++;
        }
    }

    public int getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }
}
