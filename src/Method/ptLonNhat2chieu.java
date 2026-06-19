package Method;

import java.util.Scanner;

public class ptLonNhat2chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhập số dòng: ");
        int row = sc.nextInt();
        System.out.print("nhập số cột: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Nhập mảng: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("arr[" + i + "][" + j + "]= ");
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
