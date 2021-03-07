package second_week.multi_arrays;

public class zadanie1_multiArrays {
    public static void main(String[] args) {
        int[][] twoDarray=new int[5][5];
        int value=0;
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                twoDarray[i][j]=value;
                value+=5;
                System.out.print(twoDarray[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
