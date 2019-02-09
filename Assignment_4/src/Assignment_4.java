import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;

//Each solution has been written into a function below.
public class Assignment_4{

    public static  void main (String args[]){

        String problem1 = "aaabaaaaa";

        System.out.println(findNonRepeating(problem1));


         int problem2 = 38;
         System.out.println(ShortenNumToOneDigit(problem2));


        int[] problem3 = {0,99,1,2,3,0,77,0,3,0,0,6};
        System.out.println(Arrays.toString(MoveZeroToEnd(problem3)));



         String problem4 = "raccabeefee";
         System.out.println(findPalindromic(problem4));


        int problem5[][]={{50,60,55,67,70},{62,65,70,70,81},{72,66,77,80,69}};
        rotate90Degrees(problem5);


    }

    /* Problem 1
         Giving a string, find the first non-repeating character in it and return its index.
        If it doesn’t exist, return -1
        For example: “leetcode”, return 0
    */

    static int findNonRepeating(String given_str){

        Hashtable<Character,Integer> hash_str = new Hashtable<>();


        int result = 0;

        for (int i = 0; i < given_str.length(); i++){
            int x = 0;
            if (!hash_str.containsKey(given_str.charAt(i)) ) {
                hash_str.put(given_str.charAt(i), x);
            }else {
                x++;
                hash_str.put(given_str.charAt(i), x);

            }

        }



        Enumeration<Character>  e = hash_str.keys();

        while (e.hasMoreElements()){

            Character key = e.nextElement();
            if (hash_str.get(key) != 0){
                hash_str.remove(key);
            }
        }


        if (hash_str.isEmpty()) {
            result = -1;
        }else {
            for (int i = 0; i < given_str.length(); i++) {
                if (hash_str.containsKey(given_str.charAt(i))) {

                    result = i;
                }
            }
        }
        return (result);
    }

    /* Problem 2: Given a non-negative integer num, repeatedly add all its digits until the result has
        only one digit.
    */

    private static ArrayList<Integer> ConvertToArray(int num){
        ArrayList<Integer> int_arr = new ArrayList<Integer>();

        do {
            int_arr.add(num % 10);
            num /= 10;
        }while (num > 0);

        return int_arr;

    }
    public static ArrayList<Integer> ShortenNumToOneDigit(int num){

        ArrayList<Integer> temp_arr = new ArrayList<Integer>();

        temp_arr = ConvertToArray(num);
        while (temp_arr.size() != 1){
            int temp_num = 0;

            for (int i : temp_arr){

                temp_num = temp_num + i;

            }
            temp_arr = ConvertToArray(temp_num);

        }

        return temp_arr;
    }

    /* Problem 3: Given an array nums, write a function to move all 0’s to the end of it while
                   maintaining the relative order of the non-zero elements
    */

    public static int[] MoveZeroToEnd(int[] arr){

        int p1 = 0;
        int p2 = 1;

        if (arr.length == 1){
            return arr;
        }


        while (p2 != arr.length ){

            if (arr[p1] == 0 && arr[p2] != 0 ){
                new SwapElements().swapElements(arr,p1,p2);
                p1++;
                p2++;
            }else if (arr[p1] != 0 && arr[p2] == 0){
                p1++;
                p2++;
            }else if (arr[p1] == 0 && arr[p2] == 0){
                p2++;
            }else if (arr[p1] != 0 && arr[p2] != 0){
                p1++;
                p2++;
            }


        }
        return arr;

    }

    /*
    Problem 3:  Given a string s, find the longest palindromic substring in s.
        You may assume that the maximum length of s is 1000

     */

    private static String findPalindromic(String str){



        int p = 1;
        int maxLen = 0;
        String result = "";
        int even_maxlen =0;
        String even_result = "";

        if (str.length() <= 2){
            return str;
        }

        for (p = 1; p < str.length() -1; p++){
            int high = p;
            int low = p;
            int even_low = p;
            int even_high = p + 1;

            if(str.charAt(p - 1) == str.charAt(p+1)) {

                while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {

                    maxLen = high - low + 1;
                    result = str.substring(low, high+1);
                    low--;
                    high++;

                }
            }

            if(str.charAt(p) == str.charAt(p+1)) {
                while (even_low >= 0 && even_high < str.length() && str.charAt(even_low) == str.charAt(even_high)) {

                    even_maxlen = even_high - even_low + 1;
                    even_result = str.substring(even_low, even_high+1);
                    even_low--;
                    even_high++;

                }
            }
        }

        if (maxLen > even_maxlen){

            return result;
        }else{

            return even_result;
        }


    }

    /*
    Problem 5: You are given an n x n 2D matrix representing an image. Rotate the image by 90
    degrees (clockwise).
     */

    private static int[][] rotate90Degrees (int[][] inputmatrix) {

        int rows = inputmatrix.length;
        int column = inputmatrix[0].length;
        int clone_marix[][] = new int[column][rows];

        for (int i = 0 ; i < rows; i++){
            for (int j = 0; j < column; j++){
                clone_marix[j][rows-1-i] = inputmatrix[i][j];
            }
        }

        for (int i = 0 ; i < clone_marix.length; i++){
            for (int j = 0; j < clone_marix[0].length; j++){
                System.out.println(clone_marix[i][j] + "");
            }
            System.out.println();
        }


        return clone_marix;


    }


}
