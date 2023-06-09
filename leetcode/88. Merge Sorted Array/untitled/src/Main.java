import java.util.Arrays;

public class Main {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        m--;
        n--;
        while (n > -1)
        {
            if (m > -1 && nums1[m] > nums2[n])
            {
                nums1[k] = nums1[m];
                m--;
            }
            else
            {
                nums1[k] = nums2[n];
                n--;
            }
            k--;
        }
    }
    public static void main(String[] args) {
        Main ds = new Main();
        int[] nums1;
        nums1 = new int[]{1,2,3,0,0,0};
        ds.merge(nums1, 3,new int[]{2,5,6}, 3);
        System.out.println(Arrays.toString(nums1));


        nums1 = new int[]{1};
        ds.merge(nums1, 1,new int[]{}, 0);
        System.out.println(Arrays.toString(nums1));


        nums1 = new int[]{0};
        ds.merge(nums1, 0,new int[]{1}, 1);
        System.out.println(Arrays.toString(nums1));

        nums1 = new int[]{};
        ds.merge(nums1, 0,new int[]{}, 0);
        System.out.println(Arrays.toString(nums1));

    }
}


