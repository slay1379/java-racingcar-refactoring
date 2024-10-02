package racingcar.ViewTest;

import org.junit.jupiter.api.Test;
import racingcar.view.InputView;
import static org.junit.jupiter.api.Assertions.*;

public class InputViewTest {

    @Test
    void 차_이름_유효성_검사() {
        InputView inputView = new InputView();
        assertDoesNotThrow(() -> inputView.validateCarName("Car1"));
        assertDoesNotThrow(() -> inputView.validateCarName("karin"));
    }

    @Test
    void 차_이름_너무긺_검사() {
        InputView inputView = new InputView();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> inputView.validateCarName("LongLong"));
        assertEquals("차 이름은 5자 이하여야 합니다.",exception.getMessage());
    }

    @Test
    void 차_이름_공백_검사() {
        InputView inputView = new InputView();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> inputView.validateCarName(""));
        assertEquals("차 이름은 공백일 수 없습니다.",exception.getMessage());
    }
}
