//U10416027	董郡麟
import java.util.*;
import java.util.Scanner;

public class UseBubbleSort{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		BubbleSort sort = new BubbleSort();
		
		System.out.println("How many integers you want to enter ?");
		int x = input.nextInt();
		System.out.println("");
		System.out.println("Start Enter");
		int[] array = new int [x];
		
		for(int i = 0; i < x; i++){
			int a = input.nextInt();
			array[i] = a; 
		}
		System.out.println("");
		sort.SortArray(array, x);
	}
}
