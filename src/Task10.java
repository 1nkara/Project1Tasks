public class Task10 {
    //Write a program to print out duplicate elements from an Array of Strings
    public static void main(String[] args) {
        String[]colors={"Red","Blue","White","Red","Purple","White"};
        for(int i=0;i< colors.length;i++){
            for(int j=i+1;j<colors.length;j++){
                if(colors[i]==colors[j]){
                    System.out.println(colors[j]);
                }
            }
        }
    }
}
