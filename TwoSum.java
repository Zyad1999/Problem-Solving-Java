import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSumBrute(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {}; //never reached just to run
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(numMap.containsKey(target-nums[i])){
                return new int[] {numMap.get(target-nums[i]),i};
            }else{
                numMap.put(nums[i],i);
            }
        }
        return new int[] {}; //never reached just to run
    }
}
