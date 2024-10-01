package racingcar.controller;

import racingcar.service.RaceService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RaceController {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public void run() {
        String[] carNames = inputView.inputCarNames();
        int tryCount = inputView.inputTryCount();

        RaceService raceService = new RaceService(carNames);
        raceService.startRace(tryCount);

        List<String> winners = raceService.getWinners();
        outputView.outputWinners(winners);
    }
}
