public class Main {
 public static void main(String[] args) {
  System.out.println("Hello, World!");

  int x = 6;
  System.out.println(x + 4);
  System.out.println(x);
  System.out.println(x % 2 == 0);

  int[] fib = {1, 1, 2, 3, 5, 8, 13};
  int sum = 0;
  for (int e : fib) {
   // add each element of fib to sum
   sum = sum + e;
  }
  System.out.println(sum);
 }
}