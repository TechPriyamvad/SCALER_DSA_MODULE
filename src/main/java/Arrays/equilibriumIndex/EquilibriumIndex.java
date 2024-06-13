package Arrays.equilibriumIndex;

import java.util.ArrayList;

public class EquilibriumIndex {

    public  int equilibriumIndexBruteForce(ArrayList<Integer> input){
    final int arrLen = input.size();
        // iterate over the array
        for(int i=0;i < arrLen;i++){
            // calculate the sum of left index elements
            int leftSum = 0;
            for(int j=0;j < i;j++){
                leftSum += input.get(j);
            }
            // calculate the sum of right index elements
            int rightSum = 0;
            for(int j=i+1;j < arrLen;j++){
                rightSum += input.get(j);
            }
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }

    // Prefix Sum Approach
    public  int equilibriumIndexPrefixSum(ArrayList<Integer> input){
        int arrLen = input.size();
        ArrayList<Integer> pfSum = new ArrayList<Integer>();
        pfSum.add(input.get(0));

        // create prefix sum array
        for(int i=1;i < input.size();i++){
            pfSum.add(pfSum.get(i-1) + input.get(i));
        }
        int totalSum = pfSum.get(arrLen-1);
        // calculate left index and right index elements sum
        for(int i=0;i < arrLen;i++){
            int leftSum = pfSum.get(i) - input.get(i);
            int rightSum = totalSum - pfSum.get(i);
            if(leftSum == rightSum){
                return i;
            }
        }

        return -1;
    }

    // Optimised Approach
// Time complexity: O(n)
// Space complexity: O(1)
    public int equilibriumIndexOptimised(ArrayList<Integer> input){
        int leftSum = 0;
        // calculate the total sum of the array
        int totalSum = 0;
        for(int i=0;i < input.size();i++){
            totalSum += input.get(i);
        }

        for(int i=0;i < input.size();i++){
            int rightSum = totalSum - leftSum -input.get(i);
            if(leftSum == rightSum){
                return i;
            }

            leftSum += input.get(i);
        }
        return -1;
    }

}
