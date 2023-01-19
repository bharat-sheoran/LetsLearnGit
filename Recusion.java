package LetsLearnGithub;
import java.util.Arrays;

public class Recusion {
    public static void printDecrease(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printDecrease(n - 1);
    }

    public static void printIncrease(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printIncrease(n - 1);
        System.out.print(n + " ");
    }

    public static int printFactorial(int n){
        if(n == 0){
            return 1;
        }
        return n*printFactorial(n-1);
    }

    public static int printSum(int n){
        if(n == 1){
            return 1;
        }
        return n + printSum(n-1);
    }

    public static int fibonacciNumber(int n , int dp[]){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] =  fibonacciNumber(n - 1 , dp) + fibonacciNumber(n - 2 , dp);
        return dp[n];
    }

    public static boolean isSorted(int arr[] , int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i + 1]){
            return false;
        }

        return isSorted(arr, i + 1);
        
    }
    public static void main(String[] args) {
        // int n = 7;
        // int dp[] = new int[n + 1];
        // Arrays.fill(dp, -1);
        // printDecrease(n);
        // printIncrease(n);
        // System.out.println(printFactorial(n));
        // System.out.println(printSum(n));
        // System.out.println(fibonacciNumber(n , dp));

        int arr[] = {1,2,3,4,5};
        System.out.println("The array is Sorted: " + isSorted(arr, 0));
    }
    
}