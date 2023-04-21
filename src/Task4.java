public class Task4 {
    public static void main(String[] args) {


        //Create a 2D array of integers.
        // Develop a program which will calculate the sum of even and odd numbers for that array.
        int[][] numbers = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        int oddSum = 0;
        int evenSum = 0;


        for (int[] number : numbers) {
            for (int i : number)
                if (i % 2 == 0) {
                    evenSum += i;
                } else {
                    oddSum += i;
                }
        }


        System.out.println("Even numbers sum = " + evenSum);
        System.out.println("Odd numbers sum = " + oddSum);
    }
}



