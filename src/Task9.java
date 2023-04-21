public class Task9 {
    public static void main(String[] args) {
        // Write a java program to find the second largest number in the array
        int[][] num = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        int largest = num[0][0];
        int secondLargest = num[0][0];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {

                if (num[i][j] > largest) {
                    secondLargest = largest;

                        largest = num[i][j];
                    } else if (num[i][j] > secondLargest) {

                        secondLargest = num[i][j];
                    }
                }
            }
            System.out.println(secondLargest);
        }
    }



