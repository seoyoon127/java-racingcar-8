package racingcar.domain;

import racingcar.domain.validator.CarsValidator;

import java.util.List;

public class Cars {
    private List<Car> carList;

    public Cars(List<String> carNameList) {
        CarsValidator.validateDuplicateName(carNameList);
        this.carList = carNameList.stream().map(Car::new).toList();
    }

    public List<String> getWinners(){
        int maxDistance = carList.stream().mapToInt(Car::getDistance).max().orElse(0);

        return carList.stream()
                .filter(car -> car.getDistance() == maxDistance)
                .map(Car::getName)
                .toList();
    }

    public List<Car> getCarList() {
        return carList;
    }
}
