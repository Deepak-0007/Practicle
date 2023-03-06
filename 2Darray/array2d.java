package array;

public class array2d { // main method
public static void main(String[] args) { // main method 
	int arr[][]= {{ 2,4,5},{5,6,7}}; // array declare
	for(int i=0;i<2;i++) { //for row 
		for(int j=0;j<3;j++) { // for column
			System.out.print(arr[i][j]+" "); // for print array
		} 
		System.out.println();  // print next line
	}
}
}
