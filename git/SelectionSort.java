import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, option;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter 1 for ascending order and 2 for descending order: ");
        option = sc.nextInt();
        switch (option) {
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    int min_idx = i;
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] < arr[min_idx]) {
                            min_idx = j;
                        }
                    }
                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;
                }
                break;
            case 2:
                for (int i = 0; i < n - 1; i++) {
                    int max_idx = i;
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] > arr[max_idx]) {
                            max_idx = j;
                        }
                    }
                    int temp = arr[max_idx];
                    arr[max_idx] = arr[i];
                    arr[i] = temp;
                }
                break;
            default:
                System.out.println("Invalid option!");
        }
        System.out.println("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}