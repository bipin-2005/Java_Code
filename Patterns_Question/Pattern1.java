package patterns_Question;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String args[]){ 
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the pattern size :");
        int size = input.nextInt();
    for(int i=0;i<size;i++){
        for(int j=0;j<size;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    input.close();
}
}
