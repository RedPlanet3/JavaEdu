import java.util.Arrays;

public class Main {
    void invertArr(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            sum[i] = sum[i - 1] + nums[i];
        return sum;
    }
    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;

        int [] leftToRight = runningSum(nums);
        invertArr(nums);
        int [] rightToLeft = runningSum(nums);
        invertArr(rightToLeft);
        for (int i = 0; i< nums.length; i++)
        {
            sumLeft = i > 0 ? leftToRight[i - 1] : 0;
            sumRight = i < nums.length - 1  ? rightToLeft[i + 1]: 0;
            if (sumLeft == sumRight)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Main df = new Main();
        System.out.println("3: " + df.pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println("-1: " + df.pivotIndex(new int[]{1,2,3}));
        System.out.println("0: " + df.pivotIndex(new int[]{2,1,-1}));
        System.out.println("0: " + df.pivotIndex(new int[]{2}));
    }
}