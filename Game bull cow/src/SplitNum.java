public class SplitNum {
    public static int[] spliNum(int num) {
        String numberStr = Integer.toString(num);
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return digits;
    }
}
