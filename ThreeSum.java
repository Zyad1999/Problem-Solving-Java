import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> set=new ArrayList();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1]||nums[i]>0)continue;
            int low = i+1;
            int high = nums.length-1;
            int sum = -nums[i];
            while(low<high){
                if(nums[high]+nums[low] == sum){
                    set.add(Arrays.asList(nums[i],nums[high],nums[low]));
                    while((low<high)&&nums[low]==nums[low+1])low++;
                    while((low<high)&&nums[high]==nums[high-1])high--;
                    high--;
                    low++;
                }else if(nums[high]+nums[low] > sum){
                    high--;
                }else{
                    low++;
                }
            }
        }
        return set;
    }
}
