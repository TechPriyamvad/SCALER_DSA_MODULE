package Arrays.equilibriumIndex;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int input[] = {1,3,5,2,2};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0;i < input.length;i++){
            arrayList.add(input[i]);
        }
        EquilibriumIndex eq = new EquilibriumIndex();
        int resultBruteForce = eq.equilibriumIndexBruteForce(arrayList);
        System.out.println("Equilibrium index[Brute Force]: " + resultBruteForce);
        int resultPrefixSum = eq.equilibriumIndexPrefixSum(arrayList);
        System.out.println("Equilibrium index[Prefix Sum]: " + resultPrefixSum);
        int resultOptimised = eq.equilibriumIndexOptimised(arrayList);
        System.out.println("Equilibrium index[Optimised]: " + resultOptimised);

        System.out.println("Sum of all subarrays: " + sum_of_all_subarrays.sumOfAllSubarrays());
        System.out.println("Maximum sum contiguous subarray: " + maximumSumContiguousSubarray.maxSumContiguousSubarray() + " " + maximumSumContiguousSubarray.maxSumSubarray);
        System.out.println("First missing positive integer: " + firstMissingPositiveInteger.firstMissingPositive());
    }
}
