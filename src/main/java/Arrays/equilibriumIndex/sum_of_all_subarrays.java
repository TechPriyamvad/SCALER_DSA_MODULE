package Arrays.equilibriumIndex;

public class sum_of_all_subarrays {
    private static int input[] = {2,1,3};
    public static int sumOfAllSubarrays(){
        int totalSum = 0;
        final double MOD = Math.pow(10,9) + 7;

        for(int i=0;i < input.length;i++){
            // find in how many subarrays the element is present as last element
            int lastElement = (i+1);
            // find in how many subarrays the element is present as starting element
            int firstElement = (input.length - i);
            // contribution of A[i] in all subarrays
            totalSum += (input[i] * lastElement * firstElement);
        }
        return totalSum;
    }
}
