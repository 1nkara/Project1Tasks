

public class Task6 {
    public static void main(String[] args) {
        //Write a java program to check whether a given number is prime or not
        {
            int number = 8;
            int count = 0;
            for (int i=2;i <= number / 2;i++) {
                if (number % i == 0) {
                    count++;

                }
            }
            if (count == 0) {
                System.out.println(number + " is prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }
    }
}
