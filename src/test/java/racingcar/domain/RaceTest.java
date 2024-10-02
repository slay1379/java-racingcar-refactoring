package racingcar.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class RaceTest {

    @Test
    void 자동차_리스트_생성() {
        String[] carNames =  {"pobi","woni","jun"};
        Race race = new Race(carNames);
        List<Car> cars = race.getCars();
        assertEquals(3, cars.size());
        assertEquals("pobi", cars.get(0).getName());
        assertEquals("woni", cars.get(1).getName());
        assertEquals("jun", cars.get(2).getName());

    }

    @Test
    void 제일_많이_움직인_위치_확인() {
        String[] carNames = {"pobi", "woni", "jun"};
        Race race = new Race(carNames);
        List<Car> cars = race.getCars();

        cars.get(0).advance();
        cars.get(1).advance();
        cars.get(1).advance();
        cars.get(2).advance();

        int maxPosition = race.getMaxPosition();
        assertEquals(2,maxPosition);
    }

    @Test
    void 우승자_확인() {
        String[] carNames = {"Car1", "Car2", "Car3"};
        Race race = new Race(carNames);
        List<Car> cars = race.getCars();

        cars.get(0).advance();
        cars.get(1).advance();
        cars.get(1).advance();
        cars.get(2).advance();
        cars.get(2).advance();

        List<String> winners = race.getWinners();
        assertEquals(2, winners.size());
        assertTrue(winners.contains("Car2"));
        assertTrue(winners.contains("Car3"));
    }
}
