package racingcar.ViewTest;

import org.junit.jupiter.api.Test;
import racingcar.domain.Car;
import racingcar.view.OutputView;
import static org.junit.jupiter.api.Assertions.*;

public class OutputViewTest {

    @Test
    void 차_위치_테스트() {
        OutputView outputView = new OutputView();
        Car car = new Car("TestCar");
        car.advance();
        String positionOutput = outputView.outputCarPosition(car);
        assertEquals("-", positionOutput);

        car.advance();
        positionOutput = outputView.outputCarPosition(car);
        assertEquals("--",positionOutput);
    }
}
