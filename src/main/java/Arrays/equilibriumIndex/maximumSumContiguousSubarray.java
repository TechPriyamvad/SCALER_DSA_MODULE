package Arrays.equilibriumIndex;

import java.util.ArrayList;

public class maximumSumContiguousSubarray {
    static int[] input = {-2,1,-3,4,-1,2,1,-5,4};
    static ArrayList<Integer> maxSumSubarray = new ArrayList<Integer>();
    public static int maxSumContiguousSubarray(){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int startIndex = 0;
        int endIndex = 0;
        int tempStartIndex = 0;
        // Kadane's Algorithm
        for(int i=0;i < input.length;i++){
            currentSum += input[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
                startIndex = tempStartIndex;
                endIndex = i;
            }
            if(currentSum < 0){
                currentSum = 0;
                tempStartIndex = i+1;
            }
        }
        for(int i=startIndex; i<=endIndex;i++){
            maxSumSubarray.add(input[i]);
        }

        return maxSum;
    }
}
