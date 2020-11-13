import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {

        System.out.println(
                "C++" + "\r\n" + "c#" + "\r\n" + "java" + "\r\n" + "pascal" + "\r\n" + "php" + "\r\n" + "javascript");
        Scanner in = new Scanner(System.in);
        System.out.println("პირველი რიცხვი");
        int num1 = in.nextInt();
        System.out.println("შეყვანილი რიცხვი " + num1);
        System.out.println("მეორე რიცხვი");
        int num2 = in.nextInt();
        System.out.println("შეყვანილი რიცხვი " + num2);
        int balance1 = num1 % num2;
        System.out.println("პირველის ნაშთი " + balance1);
        int balance2 = num2 % num1;
        System.out.println("მეორეს ნაშთი " + balance2);
        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();
        int sum = one + two + three;
        int multipl = one * two * three;
        int samnishna = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= samnishna; ++i) {
            sum += i;
        }
        System.out.println("ჯამი არის " + sum);
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Integer[] nums2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Arrays.sort(nums2);
        Arrays.sort(nums2, Collections.reverseOrder());
        for (int i = 0; i <= nums.length; i++) {
            System.out.println(nums[i] + "\n");
        }

        System.out.println("Max " + max(nums));
        System.out.println("Min " + min(nums));

    }

    public int gamyofi(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gamyofi(n2, n1 % n2);
    }

    public static int max(int[] nums) {
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }

    public static int min(int[] nums) {
        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }
        return minValue;
    }
}
