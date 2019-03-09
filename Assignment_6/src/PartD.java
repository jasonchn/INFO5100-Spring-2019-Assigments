import java.util.ArrayList;
import java.util.Collections;

import static java.lang.StrictMath.abs;

public class PartD {

    /*
    Given a target integer target and an integer array A sorted in ascending order, find the index i in A such that A[i] is closest to target.
     Please write main() method to test your code.

    Assumptions:
            1.	There can be duplicate elements in the array, and we can return any of the indices with same value.
            2.	if A is null or A is empty, throw exception to remind users.

    Example:
    A = [1, 3, 3, 4], target = 2, return 0 or 1 or 2
    A = [0, 1, 5], target = 7, return 2
    */

    public int findTarget(int a, ArrayList<Integer> b){

        int arrLen = b.size();
        if(arrLen - 1 < 0)
            throw new IllegalArgumentException("The array cannot be empty");
        int diff =Math.abs(b.get(0) - a);
        int index = 0;
        ArrayList<Integer> indexArr = new ArrayList<>();

        for(int i = 0; i < arrLen; i ++){
            int newDiff = Math.abs(b.get(i) - a);
            if(newDiff < diff){
                index = i;
                diff = newDiff;
            }
        }
        return index;


    }

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arrEmpty = new ArrayList<>();


        arr.add(0);
        arr.add(5);
        arr.add(8);
        arr.add(12);
        arr.add(24);

        PartD newtest = new PartD();
        int indexResult = newtest.findTarget(10,arr);

        for (int m = 0; m < arr.size(); m++){
            if (arr.get(m) == arr.get(indexResult)){
                System.out.println(m);
            }
        }


    }


}
