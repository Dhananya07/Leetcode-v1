public class Twosum{
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<=nums.length; i++){
            for (int j=i+1; j<=nums.length; j++){
                if(nums[i]+nums[j] == target){
                    System.out.println(i + " " + j);
                    return new int[]{i,j};
                 }
            }
        }
        return new int[]{};
        
    }

    public static void main(String args[]){
        int nums[]={2,4,6,8,3,5};
        int target=5;
        Twosum obj = new Twosum();
        obj.twoSum(nums,target);

    }
}