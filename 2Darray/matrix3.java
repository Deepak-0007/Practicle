package array;

public class matrix3 {
	public static void main(String[] args) { // main method 
		int arr1[][]= {{2,4,5},{5,6,7},{8,9,0}}; // array 1 declare for matrix
		int arr2[][]= {{1,2,4},{3,5,8},{4,5,6}}; // array2 declare for matrix
		int arr[][]= new int[3][3]; // array3 for addition of 2 array in matrix
		for(int i=0;i<3;i++) { //for row 
			for(int j=0;j<3;j++) { // for column
			 arr[i][j]=arr1[i][j]+arr2[i][j]; // logic of addtion of 2 array
				System.out.print(arr[i][j]+" "); // for print array
			} 
			System.out.println();  // print next line
		}
	}

}
