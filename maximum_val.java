//1. Finding the Maximum Value in an Array

public class maximum_val {
    public static void main(String[] args) {
        int[] num_array = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        int max = num_array[0];

        //Process
        //Implement for-loop to find the largest number 
        for(int i = 0; i < num_array.length; i++){
            //Condition using if statement
            if(num_array[i] > max){
                max = num_array[i];
            }
        }

        //print question
        System.out.println("---------------------------------------------");
        System.out.println("Find the maximum value in the array");
        System.out.println("---------------------------------------------");
        System.out.println("Array = {1, 3, 5, 7, 9, 2, 4, 6, 8}");
        System.out.println("---------------------------------------------");

        //print output
        System.out.println("The maximum value in the array is: " + max);
        System.out.println("---------------------------------------------");
    }
}
