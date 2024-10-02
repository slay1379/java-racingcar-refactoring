package racingcar.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RaceServiceTest {

    private RaceService raceService;

    @BeforeEach
    void setUp() {
        String[] carNames = {"pobi", "woni", "jun"};
        raceService = new RaceService(carNames);
    }

}
