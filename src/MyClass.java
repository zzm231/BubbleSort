import static java.util.Collections.swap;

public class MyClass {
    public static void main(String[] args) {
        int[] nums = {99, 98, 97, 96, 100, 101, 102, 103};

        System.out.println("排序前数组");
        for (int element : nums) {
            System.out.print(element+"\t");
        }

        // 冒泡排序
        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = 0; i < nums.length - 1 -i; i++) {
                int temp = 0;
                if (nums[i] > nums[i + 1]) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后数组");
        for (int i : nums) {
            System.out.print(i+"\t");
        }
    }
}
