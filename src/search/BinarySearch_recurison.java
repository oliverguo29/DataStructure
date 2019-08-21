package search;

public class BinarySearch_recurison {

    public static  int binarySearch_recurison(int [] score, int target){
        int low=0;
        int high=score.length-1;


        return  helper(score, target, low, high);
    }
    //使用递归
    public static  int helper(int [] score, int target,int low,int high) {

        if (low > high) {                           //结束条件1
            return -1;
        }
        int medium = (low + high) / 2;

        if (target == score[medium]) {             //结束条件2
            return medium;

        } else if (target < score[medium]) {

            return helper(score, target, low, medium - 1);

        } else {

            return helper(score, target, medium + 1, high);
        }

     }
}
