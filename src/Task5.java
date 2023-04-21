public class Task5 {
    public static void main(String[] args) {
//Write a program to swap 2 numbers without a temporary variable

            int x = 10;
            int y = 5;
            x = x + y;//15
            y = x - y;//10
            x = x - y;//5
            System.out.println("After swapping:"
                    + " x = " + x + ", y = " + y);
    }
}
