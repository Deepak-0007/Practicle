import java.util.Scanner;

public class reverse_array {

    public static void main(String args[]) {
        int sum = 0;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the element of the array");
        int n = a.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = a.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println("reverse array is ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

}
