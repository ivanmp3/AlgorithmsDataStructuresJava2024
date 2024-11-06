package InputProcessingMethods;

import TargetNumMethods.DataSource;
import gamelogic.GameLogic;
import util.ComputerGuessGenerator;
import util.GetInput;

public class ComputerInput implements InputMethods {
    private final ComputerGuessGenerator guessGenerator = new ComputerGuessGenerator();

    @Override
    public void processInput(GetInput getInput, DataSource target, GameLogic gameLogic) {
        int targetNumber = target.getInput();
        int attempts = 0;
        boolean guessed = false;

        System.out.println("Компьютер пытается угадать 4-значное число...");

        int previousGuess = generateComputerGuess(); // Начальное предположение
        int[] lastResult = new int[2]; // Массив для хранения количества быков и коров

        while (!guessed) {
            attempts++;

            System.out.println("Компьютер предполагает: " + previousGuess);

            if (previousGuess == targetNumber) {
                System.out.println("Компьютер угадал число " + targetNumber + " за " + attempts + " попыток.");
                guessed = true;
            } else {
                int[] result = gameLogic.checkBC(previousGuess, targetNumber);
                lastResult[0] = result[0]; // Быки
                lastResult[1] = result[1]; // Коровы
                System.out.println("Быки: " + result[0] + " Коровы: " + result[1]);

                // Генерация следующего предположения
                try {
                    previousGuess = guessGenerator.generateNextGuess(previousGuess, lastResult[0], lastResult[1]);
                } catch (IllegalStateException e) {
                    System.out.println("Ошибка: Не найдено подходящее следующее число. Программа должна угадывать до конца.");
                    break;
                }
            }
        }
    }

    private int generateComputerGuess() {
        return (int) (Math.random() * 9000) + 1000;  // Число от 1000 до 9999
    }
}
