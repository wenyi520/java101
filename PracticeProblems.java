public class PracticeProblems {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = {1, 2, 5, 5, 5, 3};

        for (int value : arr) {
            if (value == 5) {
                count++;
            }
        }
        System.out.println(count);
// Second problem code moved to a separate section in main
        System.out.println("Sum of numbers from 20 to 40 (step 5):");
        int[] numbers = {20,25,30,35,40};
        int sum = 0;
        for (int i = 20; i <= 40; i += 5) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("Reversed array:");
        int[] results = reverseArray(numbers);
        for (int num : results) {
            System.out.println(num);
        }
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
}
// Third Problem code moved to a separate section in main
class GridSum {
 public static void main(String[] args) {
  double [] [] grid = {
    {2.5,3.5,4.0},
    {3.0,4.0,5.5},
    {5.0,6.5,7.5}
  };
  
  double result = sumGrid(grid);
  System.out.println(result);
  System.out.println(result % 2 == 0);
 }

 public static double sumGrid(double[][] grid) {
     double sum = 0;
     for (int i = 0; i < grid.length; i++) {
         for (int j = 0; j < grid[i].length; j++) {
             sum += grid[i][j];
         }
     }
     return sum;
 }
}
// Fourth Problem code moved to a separate section in main
class Fibonacci {
 public static int fib(int n) {
    if (n == 0) return 0;
    else if (n == 1) {
     return 1;
    } else {
     return fib(n - 1) + fib(n - 2);
    }
 }
}