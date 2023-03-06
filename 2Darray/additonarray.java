package array;

public class additonarray {
	public static void main(String[] args) { // main method 
		int arr1[][]= {{ 2,4,5},{5,6,7}}; // array declare
		int arr2[][]= {{ 1,2,4},{3,5,8}};
		int arr[][]= new int[2][3];
		for(int i=0;i<2;i++) { //for row 
			for(int j=0;j<3;j++) { // for column
			 arr[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr[i][j]+" "); // for print array
			} 
			System.out.println();  // print next line
		}
	}
}
