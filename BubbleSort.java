import java.util.*;

public class BubbleSort{
	public void SortArray(int[] sortarray, int b){
		int largest;
		boolean check = true;
		
		while(check == true){
			check = false;
			
			for(int i = 0; i < sortarray.length - 1; i++){
				if(sortarray[i] < sortarray[i+1]){
					largest = sortarray[i+1];
					sortarray[i+1] = sortarray[i];
					sortarray[i] = largest;
					check = true;
				}
			}
		}
		
		System.out.println("The Bubble Sort is");
		for(int i = 0; i < b; i++){
			System.out.println(sortarray[i]);
		}
	}
}
