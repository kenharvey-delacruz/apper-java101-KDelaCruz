public class OddEven {

// Java program that determines whether a number is odd or even, 
// and then returns the total number of odd and even numbers.
// array nums contains the numbers that will be checked
// array ans contains the number of odd and even numbers
// ans[0] contains # of odd, ans[1] contains # of even

    public static void main(String[] args) {
        int[] nums = new int[]{1, 234, 2, 4, 56, 17, 50, 1235, 6, 1, 23, 48, 47, 34};
        int[] ans = CountOddEven(nums);
        System.out.println("Odd: " + ans[0]);
        System.out.println("Even: " + ans[1]);
    }

    public static int[] CountOddEven(int[] nums){
        int[] oddeven = new int[2];

        for (int i=0 ; i < nums.length ; i++){

            if (nums[i]%2 == 0){
                oddeven[1]++;
            } else {
                oddeven[0]++;
            }
        }
        return oddeven;
    }
}