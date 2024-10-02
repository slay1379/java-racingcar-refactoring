package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    void 자동차_이름과_초기_위치_확인() {
        Car car = new Car("pobi");
        assertEquals("pobi",car.getName());
        assertEquals(0, car.getPosition());
    }

    @Test
    void 자동차_한_칸_전진() {
        Car car = new Car("pobi");
        car.advance();
        assertEquals(1,car.getPosition());
        car.advance();
        assertEquals(2,car.getPosition());
    }
}
