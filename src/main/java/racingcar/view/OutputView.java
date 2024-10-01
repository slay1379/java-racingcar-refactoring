package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Race;

import java.util.List;

public class OutputView {
    private static final String RESULT_MSG = "실행 결과";
    private static final String WINNER_MSG = "최종 우승자 : ";

    public void outputRoundResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + outputCarPosition(car));
        }
        System.out.println();
    }

    public String outputCarPosition(Car car) {
        return "-".repeat(car.getPosition());
    }

    public void outputWinners(List<String> winners) {
        System.out.println(WINNER_MSG + String.join(", ", winners));
    }
}
