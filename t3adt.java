package t3;
/*
 * @author Narongchai Rongthong
 * 652115013  dd/mm/yyyy
 * written on 23/12/2022
 * https://github.com/t1ww
 */

import java.util.Scanner;
import java.util.Vector;

public class t3adt {
    public static void main(String[] args) {
        Vector<Integer> array = new Vector<Integer>();
        Scanner scan = new Scanner(System.in);
        //loop
        System.out.println("(input nothing to stop and show result)");
        while(true){
            System.out.print("Enter the numbers : ");
            String str = scan.nextLine();   //recieve input
            if(str.isEmpty())break;         //if nothing break out of loop
            int i = Integer.parseInt(str);  //parse string into integer
            array.add(i);                   //add int to array

        }
        //output
        //show array lists
        showVectorLists(array);
        //bubble sort
        System.out.println("\nAfter sorting (bubble sort)");
        array = vBubbleSort(array);
        //show again
        showVectorLists(array);
        //end
        System.out.println("PROGRAMME ENDS");
    }
    private static Vector<Integer> vBubbleSort(Vector<Integer> v){
        int n = v.size();
        int temp = 0 ;
        for (int i = 0; i < n ; i++) {
            for (int j = 1 ; j < ( n - i ) ; j ++) {
                if ( v.get(j - 1) > v.get(j)) {
                    temp = v.get(j-1);
                    v.set(j-1,v.get(j));
                    v.set(j,temp);
                }
            }
        }
        return v;
    }

    private static void showVectorLists(Vector<Integer> v){
        System.out.print(" { | ");
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " | ");
        }
        System.out.print(" } ");
    }
}