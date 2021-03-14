public class ProblemSet13 {

    public static void main(String[] args){
        int start = 2;
        int[] numbers = {2, 4, 7};
        int target = 9;

        System.out.println(groupSum(start, numbers, target));
    }


    public static boolean groupSum(int start, int[] numbers, int target) {

        //start is the index you start looking at
        //numbers is the array
        //target is the target sum
        if (start >= numbers.length) { //base case: when you reach the end of the array, add 0
            return (target == 0);
        }
        if(numbers[start] == target){
            return true;
        }

        return groupSum(start + 1, numbers, target - numbers[start]) ||
                groupSum(start + 1,numbers,target);
    }
/*
    public static boolean groupSum6(int start, int[] numbers, int target) {

    }

    public static boolean groupNoAdj(int start, int[] numbers, int target) {

    }

    public static boolean groupSum5(int start, int[] numbers, int target) {

    }

    public static boolean groupSumClump(int start, int[] numbers, int target) {

    }

    public static boolean splitArray(int[] numbers) {

    }

    public static boolean splitOdd(int[] numbers) {

    }*/
}
