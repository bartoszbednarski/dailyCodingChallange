/*
    Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

    For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

    Bonus: Can you do this in one pass?
 */

import java.util.Arrays;

public class Challenge1 {

    public static void main(String[] args) {
        int[] test = {10,25,3,6,1,45};

        System.out.println(checkIfNumbersAddUpToK(test,16));
    }

    public static boolean checkIfNumbersAddUpToK(int[] testedArray, int k){
        boolean result = false;
        int[] sortedArray = Arrays.stream(testedArray).sorted().toArray();
        for (int i = 0; i<sortedArray.length-1; i++){
            if (sortedArray[i] > k) break;
            for (int j =i+1; j<sortedArray.length; j++){
                if (sortedArray[i] + sortedArray[j] == k) return true;
                else if (sortedArray[i] + sortedArray[j] > k) break;
            }
        }
        return result;
    }
}
