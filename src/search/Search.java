package search;

import java.util.Arrays;

/**
 * 在分数中查询制定分数的索引---顺序查找
 */
public class Search {
    public static void main(String[] args) {
        //array
        //int [] k = new int []{89,45,78,66,100,98,90,75,36};

        //target
        //int target =35;

        //result
        //search(k,target);
        int [] k = new int []{35,46,58,62,71,88,95,100};
        int target =100;
        //int i = binarySearch(k, target);

       // int i = binarySearch_recurison(k, target);
       // System.out.println(i);


    }

    public static  int search(int [] score, int target){
        int index=-1;

        for(int i=0;i<score.length;i++){
            if(score[i]==target){
                index=i;
                break;
            }
        }

        return index;
    }








}
