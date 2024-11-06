package util;

import java.util.ArrayList;
import java.util.List;

public class ComputerGuessGenerator {
    private List<String> possibleNumbers = generateAllPossibleNumbers();

    public int generateNextGuess(int previousGuess, int bulls, int cows) {
        String previousGuessStr = String.format("%04d", previousGuess);

        // Обновляем список возможных чисел, удаляя неподходящие варианты
        possibleNumbers.removeIf(number -> !matchesBullsAndCows(previousGuessStr, number, bulls, cows));

        // Проверяем, есть ли возможные числа для следующей догадки
        if (!possibleNumbers.isEmpty()) {
            // Возвращаем первое число из списка
            int nextGuess = Integer.parseInt(possibleNumbers.get(0));
            possibleNumbers.remove(0); // Удаляем выбранное число, чтобы избежать повторов
            return nextGuess;
        }

        // Если список пуст, это индикатор ошибки логики фильтрации
        throw new IllegalStateException("Ошибка: список возможных чисел пуст, но программа должна угадывать до конца.");
    }

    private boolean matchesBullsAndCows(String guess, String candidate, int bulls, int cows) {
        int calculatedBulls = 0;
        int calculatedCows = 0;
        boolean[] usedCandidate = new boolean[4];
        boolean[] usedGuess = new boolean[4];

        // Подсчет количества быков
        for (int i = 0; i < 4; i++) {
            if (guess.charAt(i) == candidate.charAt(i)) {
                calculatedBulls++;
                usedCandidate[i] = true;
                usedGuess[i] = true;
            }
        }

        // Подсчет количества коров
        for (int i = 0; i < 4; i++) {
            if (!usedGuess[i]) {
                for (int j = 0; j < 4; j++) {
                    if (!usedCandidate[j] && guess.charAt(i) == candidate.charAt(j)) {
                        calculatedCows++;
                        usedCandidate[j] = true;
                        break;
                    }
                }
            }
        }

        return calculatedBulls == bulls && calculatedCows == cows;
    }

    private List<String> generateAllPossibleNumbers() {
        List<String> numbers = new ArrayList<>();
        for (int i = 1000; i <= 9999; i++) {
            numbers.add(String.valueOf(i));
        }
        return numbers;
    }
}
