package racingcar.domain;

import racingcar.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private final List<Car> cars;
    public static final int MIN_CAN_ADVANCE_NUMBER = 4;

    public Race(String[] carNames) {
        this.cars = createCars(carNames);
    }

    public List<Car> createCars(String[] carNames) {
        List<Car> carList = new ArrayList<>();
        for (String carName : carNames) {
            carList.add(new Car(carName));
        }
        return carList;
    }

    public List<Car> getCars() {
        return cars;
    }

    public int getMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }

    public List<String> getWinners() {
        List<String> winners = new ArrayList<>();
        int maxPosition = getMaxPosition();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        return winners;
    }



}
