public class Task8 {
    public static void main(String[] args) {
        //Maximum and minimum number in the array
        int[][] num={
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };
        int max = num[0][0];
        int min = num[0][0];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if(max < num[i][j]){
                    max = num[i][j];
                }else if(min > num[i][j]){
                    min = num[i][j];
                }
            }
        }
        System.out.println("Maximum number: "
                + max + " Minimum number: " + min);
    }
}
