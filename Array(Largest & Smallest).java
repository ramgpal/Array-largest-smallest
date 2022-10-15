/*A given array numbers= {2,4,6,8,10,12,14,16}, we have to find index position of 10 in this given array*/

import java.util.*;
public class Main
{
    public static int Get_Largest(int numbers[]) {
       int largest=Integer.MIN_VALUE; //-infinity
       int smallest=Integer.MAX_VALUE; //+Infinity
        for(int i=0;i<numbers.length;i++) {
            if (largest<numbers[i]) {
                largest=numbers[i];
            }
        if(smallest>numbers[i]) {
            smallest=numbers[i];
        } }
        System.out.println(smallest);
        return largest;
    }
	public static void main(String[] args) {
	int numbers[]={1,2,6,3,5};
	
	    System.out.println(Get_Largest(numbers));
}
}