import util.GetInput;

public class ChouseInput {
    public static int chouseInput() {
        System.out.print("Выберите, как загадать число:\n" +
                "\t1 -- Случайное число\n" +
                "\t2 -- Сами вводите число\n" +
                "\t3-9 -- Из UI\n");
        return GetInput.getInput(1);
    }
}
