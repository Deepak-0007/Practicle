import java.util.Scanner;

import javax.swing.ImageIcon;

public class array3 {

    public static void main(String args[]) {

        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = a.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
