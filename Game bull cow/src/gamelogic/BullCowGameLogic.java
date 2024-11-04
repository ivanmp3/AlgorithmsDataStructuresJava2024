package gamelogic;

import util.SplitNum;

public class BullCowGameLogic implements GameLogic{
    @Override
    public int[] checkBC(int a, int b) {
            int[] A = SplitNum.spliNum(a);
            int[] B = SplitNum.spliNum(b);
            int bulls = 0;
            int cows = 0;
            boolean[] countedA = new boolean[A.length];
            boolean[] countedB = new boolean[B.length];

            // Логика для подсчета быков и коров
            for (int i = 0; i < A.length; i++) {
                if (A[i] == B[i]) {
                    bulls++;
                    countedA[i] = true;
                    countedB[i] = true;
                }
            }
            for (int i = 0; i < A.length; i++) {
                if (!countedA[i]) {
                    for (int j = 0; j < B.length; j++) {
                        if (A[i] == B[j] && !countedB[j]) {
                            cows++;
                            countedB[j] = true;
                            break;
                        }
                    }
                }
            }
            return new int[]{bulls, cows};
    }
}

