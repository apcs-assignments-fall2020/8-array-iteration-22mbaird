import java.util.Scanner;
public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length/2; i++){
            int x = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = x;
        }
        return arr;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            for (int k = i+1; k < arr.length; k++){
                if (arr[k] > arr[i]){
                   int x = arr[i];
                   arr[i] = arr[k];
                   arr[k] = x;
                }
            }
        }
        return arr[arr.length - 2];
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        double[] factor = new double[arr.length-1];
        for (int i = 0; i < arr.length; i++){
            factor[i] = Double.valueOf(arr[i+1])/Double.valueOf(arr[i]);
        }
        int c = 0;
        for (int i= 1; i < factor.length; i++){
             if (factor[i] == factor[i-1]){
                c +=1; 
            }
        }
        
        if (c == factor.length -1){
            return true;
        }
        else{
            return false;
        }
    }   


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many values: ");
        int num1 = scan.nextInt();
        int arr_1[] =  new int[num1];
        System.out.println("Enter all values: ");
        for (int i = 0; i < num1; i++){
            arr_1[i] = scan.nextInt();
        }
        System.out.println(reverse(arr_1));
        System.out.print("How many values: ");
        int num2 = scan.nextInt();
        int arr_2[] =  new int[num2];
        System.out.println("Enter all values: ");
        for (int i = 0; i < num2; i++){
            arr_2[i] = scan.nextInt();
        }
        System.out.println(secondLargest(arr_2));
        System.out.print("How many values: ");
        int num3 = scan.nextInt();
        int arr_3[] =  new int[num3];
        System.out.println("Enter all values: ");
        for (int i = 0; i < num3; i++){
            arr_3[i] = scan.nextInt();
        }
        System.out.println(isGeometric(arr_3));
        
        scan.close();
    } 
}
