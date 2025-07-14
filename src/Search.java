package src;

public class Search {
    public static void main(String[] args) {
        int inputArray [] = {5,7,2,4,8,1};
        int bsArray[] = {1,2,4,6,7,8,9};
        int target = 8;
//        int target = 10;
        int targetIndexls = linearSearch(inputArray, target);
        System.out.println("Index of searched number using linearSearch is "+ targetIndexls);
        int targetIndexbs = binarySearch(bsArray, target);
        System.out.println("Index of searched number using binarySearch is "+ targetIndexbs);
    }

    public static int linearSearch(int[] inputArray, int target){
        for(int i=0; i<inputArray.length; i++){
            if(inputArray[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] inputArray, int target){
        int start = 0;
        int end = inputArray.length-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(inputArray[mid] == target){
                return mid;
            } else if(inputArray[mid] < target){
                start = mid+1;
            } else if(inputArray[mid] > target){
                end = mid-1;
            }
        }
        return -1;
    }
}
