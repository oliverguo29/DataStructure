package search;

public class BinarySearch {
    public static  int binarySearch(int [] score, int target){
        int low=0;
        int high=score.length-1;

        int medium=0;

        while(low<=high) {
            medium = (low + high) / 2;
            if (target == score[medium]) {
                return medium;
            } else if (target < score[medium]) {
                high = medium-1 ;

            } else {
                low = medium+1 ;
            }
        }

        return -1;

    }
}
