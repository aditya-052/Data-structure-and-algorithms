import java.util.Scanner;

public class InsertionSort {

    public static int[] Sorting(int[] array) {
        int[] arr = new int[array.length];
        arr[0] = array[0];

        int firstIndex = 1;
        int lastIndex = 0;
        int position = 0;

        while (arr.length <= array.length) {
            if (arr[lastIndex] < array[firstIndex]) {
                arr[lastIndex + 1] = array[firstIndex];
                lastIndex++;
                firstIndex++;
            } 
            while(arr[lastIndex]>array[firstIndex]) {
                arr[lastIndex+1]=arr[lastIndex];
                arr[lastIndex]=array[firstIndex];
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            int item = sc.nextInt();
            array[i] = item;
        }
        int[] result = Sorting(array);
        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i] + " ");
        }
        sc.close();
    }

}
