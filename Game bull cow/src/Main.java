import java.util.Random;
import java.util.Arrays;

public class Main {

    public static int genRand() {
        Random random = new Random();
        return 1000 + random.nextInt(9000);
    }
    public static int[] spliNum(int num) {
        String numberStr = Integer.toString(num);
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return digits;
    }
    public static boolean existsInArray(int[] array, int value) {
        Arrays.sort(array);
        return Arrays.binarySearch(array, value) >= 0; // Returns true if found
    }
//    public static int[] checkBС(int a,int b) {
//        int[] A = spliNum(a);
//        int[] B = spliNum(b);
//        int bulls = 0;
//        int cows = 0;
//        for (int i = 0; i < A.length; i++) {
//            if (A[i] == B[i]) {
//                bulls += 1;
//            } else if (existsInArray(A, B[i])) {
//                cows += 1;
//            }
//        }
//        return new int[]{bulls, cows};
//    }
    public static int[] checkBC(int a, int b) {
        int[] A = spliNum(a);
        int[] B = spliNum(b);
        int bulls = 0;
        int cows = 0;
        boolean[] countedA = new boolean[A.length]; // для отметки быков
        boolean[] countedB = new boolean[B.length]; // для отметки коров

        // Считаем быков
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i]) {
                bulls++;
                countedA[i] = true; // отметить, что эта цифра - бык
                countedB[i] = true; // отметить, что эта цифра - бык
            }
        }

        // Считаем коров
        for (int i = 0; i < A.length; i++) {
            if (!countedA[i]) { // проверяем, не был ли уже посчитан бык
                for (int j = 0; j < B.length; j++) {
                    if (A[i] == B[j] && !countedB[j]) { // проверяем, не был ли уже посчитан бык
                        cows++;
                        countedB[j] = true; // отметить, что эта цифра - корова
                        break; // выйти из внутреннего цикла
                    }
                }
            }
        }

        return new int[]{bulls, cows};
    }
    public static void main(String[] args) {
        int num = genRand();
        int a = 7134;
        int b = 1774;
        int R[] = checkBC(a,b);
        // Output the result
        System.out.println("The bulls is: " + R[0] + " The cows is: " + R[1]);
    }
}
