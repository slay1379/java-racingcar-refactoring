package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;
import racingcar.domain.Race;
import racingcar.view.OutputView;

import java.util.List;

public class RaceService {
    private final Race race;
    private final OutputView outputView = new OutputView();

    public RaceService(String[] carNames) {
        this.race = new Race(carNames);
    }

    public void startRace(int tryCount) {
        for (int i = 0; i < tryCount; i++) {
            playOneRound();
            outputView.outputRoundResult(race.getCars());
        }
    }

    public void playOneRound() {
        List<Car> cars = race.getCars();
        for (Car car : cars) {
            if (canAdvance()) {
                car.advance();
            }
        }
    }

    public boolean canAdvance() {
        return Randoms.pickNumberInRange(0, 9) >= Race.MIN_CAN_ADVANCE_NUMBER;
    }

    public List<String> getWinners() {
        return race.getWinners();
    }
}
