public class Task1 {
    public static void main(String[] args) {
        //. Create a program that uses an array to store a list of temperatures for a week,
        // and then uses a loop to find the highest and lowest temperature for the week.//

        int[]temp={15,25,35,45,55,65,75};
        int highest=temp[0];
        int lowest=temp[0];
        for(int i=0;i<temp.length;i++){
            if(temp[i]>highest)
                highest=temp[i];
            else if(temp[i]<lowest)
                lowest=temp[i];
            }
        System.out.println(highest);
        System.out.println(lowest);
        }
    }

