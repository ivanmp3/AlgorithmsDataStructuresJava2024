public class ChouseInput {
    public static int constInput() {
        System.out.print("Выберете как загадать число: " +
                "1 -- Случайное число" +
                "2 -- Сами вводите число" +
                "3 -- Из UI");
        return GetInput.getInput(1);
    }
}
