import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[][] arr;
        int col, row;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập số lượng mảng: ");
            col = scanner.nextInt();
            System.out.print("\n" + "Nhập số lượng phần tử: ");
            row = scanner.nextInt();
            if (col > 5 && row > 5) {
                System.out.println("Nhập lại");
            }
        } while (col > 5 && row > 5);
        arr = new int[col][row];
        int[][] array;
        inputArr(arr);
        displayArr(col, row, arr);
        System.out.print("Nhập vị trí mảng muốn thêm: ");
        int col1 = scanner.nextInt();
        System.out.print("Nhập vị trí trong mảng muốn thêm: ");
        int row1 = scanner.nextInt();
        System.out.print("Nhập giá trị: ");
        int num1 = scanner.nextInt();
        array = new int[col][row + 1];
        displayArray(array);
        addIndex(col1, row1, num1, arr, array);
        displayArray(array);
    }

    public static void displayArr(int col, int row, int[][] arr) {
        for (int[] element : arr) {
            for (int e : element) {
                System.out.print(e + "\t");
            }
            System.out.println();
        }
    }

    public static void inputArr(int[][] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Nhập phần tử cột " + i + " hàng " + j + ": ");
                arr[i][j] = input.nextInt();
            }
        }
    }

    public static void displayArray(int[][] array) {
        for (int[] element : array) {
            for (int e : element) {
                System.out.print(e + "\t");
            }
            System.out.println();
        }
    }

    public static void addIndex(int col1, int row1, int num1, int[][] arr, int[][] array) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Nhập vị trí mảng muốn thêm: ");
//        int col1 = input.nextInt();
//        System.out.print("Nhập vị trí trong mảng muốn thêm: ");
//        int row1 = input.nextInt();
//        System.out.print("Nhập giá trị: ");
//        int num1 = input.nextInt();
//        array = new int[col1][row1];
//        array[col1][row1 - 1] = num1;
//        System.out.println("4--" + (col1 - 1) + (row1 - 1) + array[col1 - 1][row1 - 1]);

        for (int i = 0; i <= col1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                array[i][j] = arr[i][j];
                System.out.println("1--" + array[i][j]);
            }
        }
        for (int i = array.length; i >= col1 - 1; i--) {
            for (int j = array.length; j > row1 - 1; j--) {
                array[i][j] = arr[i][j - 1];
//                array[i][j] = 5;
                System.out.println("2--");
            }
        }

        array[col1][array[col1].length - 1] = arr[col1][arr[col1].length - 1];
        System.out.println("3--" + array[col1 - 1][array.length - 1]);
        array[col1][row1 - 1] = num1;
        System.out.println("4--" + (col1) + (row1 - 1) + array[col1][row1 - 1]);
    }
}
