import java.util.Arrays;

public class Main {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++)
            if (arr[i] - arr[i - 1] != diff) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}