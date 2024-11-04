package util;

public class ChouseInput {
    public static int chouseInput() {
        System.out.print("Выберите, как загадать число:\n" +
                "\t0 -- Сами вводите число\n" +
                "\t1 -- Случайное число\n" +
                "\t2-9 -- Из UI\n");
        return GetInput.getInput(1);
    }
}
