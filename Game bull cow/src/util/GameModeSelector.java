package util;

import InputProcessingMethods.ComputerInput;
import InputProcessingMethods.HumanInput;
import InputProcessingMethods.ComputerRandomInput;
import InputProcessingMethods.InputMethods;

public class GameModeSelector {
    public static InputMethods chooseGameMode() {
        System.out.print("Выберите режим игры:\n" +
                "\t0 -- Игрок\n" +
                "\t1 -- Компьютер случайно подбирает\n" +
                "\t2-9 -- Компьютер вдумчиво подбирает\n");

        int choice = GetInput.getInput(1);
        if (choice == 0) {
            return new HumanInput(); // Режим для игрока
        } else if (choice == 1) {
            return new ComputerRandomInput(); // Режим для компьютера
        } else {
            return new ComputerInput();
        }
    }
}
