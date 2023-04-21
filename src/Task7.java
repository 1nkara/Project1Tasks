public class Task7 {
    public static void main(String[] args) {
        //Write a Java Program to print the first 10 numbers of Fibonacci series

        int n = 10, x = 0, y = 1;
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(x + "  ");
            int sum = x + y;
            x = y;
            y = sum;
        }
    }
}


