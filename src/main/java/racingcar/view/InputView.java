package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    private static final String CAR_INPUT_MSG = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String TRY_COUNT_INPUT_MSG = "시도할 회수는 몇회인가요?";
    private static final int MAX_CAR_NAME_LENGTH = 5;


    public String[] inputCarNames() {
        while (true) {
            try {
                System.out.println(CAR_INPUT_MSG);
                String[] carNames = Console.readLine().split(",");

                for (String carName : carNames) {
                    validateCarName(carName.trim());
                }

                for (int i = 0; i < carNames.length; i++) {
                    carNames[i] = carNames[i].trim();
                }
                return carNames;
            } catch (IllegalArgumentException e) {
                System.out.println("입력 오류: " + e.getMessage());
                System.out.println("다시 입력해주세요.");
            }
        }
    }

    public int inputTryCount() {
        System.out.println(TRY_COUNT_INPUT_MSG);
        return Integer.parseInt(Console.readLine());
    }

    public void validateCarName(String carName) {
        if (carName.length() > MAX_CAR_NAME_LENGTH) {
            throw new IllegalArgumentException("차 이름은 5자 이하여야 합니다.");
        }
        if (carName.isEmpty()) {
            throw new IllegalArgumentException("차 이름은 공백일 수 없습니다.");
        }
    }
}
