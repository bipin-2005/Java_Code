package basicMaths_Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DivisorNumber {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter the number : ");
        int value =input.nextInt();
        for(int i =1;i*i<=value;i++){
            if(value%i==0){
                arr.add(i);
                if(i!=value/i) arr.add(value/i);
            }
        }
        Collections.sort(arr);
        System.out.println(arr);
        input.close();
    }  
}
