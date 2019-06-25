package maxnum;


public class MaxNum {
    public static void main(String[] args) {
        double[] nums={5,9,2,30,80,-52,100,0,5,2,80};
        double max = nums[0];
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println(max);
    }
}
