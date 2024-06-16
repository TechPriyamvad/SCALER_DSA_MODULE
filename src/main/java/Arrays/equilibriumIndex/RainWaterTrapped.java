package Arrays.equilibriumIndex;

public class RainWaterTrapped {
    static int input[] = {3,2,1,4,3,5};

    static int rainWaterTrapped(){
        int arrLen = input.length;
        int left = 0;
        int right = arrLen - 1;
        int leftmax = 0;
        int rightMax = 0;
        int trappedWater = 0;

        while(left <= right){
            // decide which pointer to move
            // move left pointer
            if(input[left] <= input[right]){
                //find maximum height of building to left
                if(input[left] >= leftmax)
                {
                    leftmax = input[left];
                }
                // find how much water can be trapped in i th building
                trappedWater += (leftmax - input[left]);
                left++;
            }
            // move right pointer
            else{
                // find maximum height of building to right
                if(input[right] >= rightMax)
                    rightMax = input[right];
                trappedWater += (rightMax - input[right]);
                right--;
            }
        }

        return trappedWater;
    }
}
