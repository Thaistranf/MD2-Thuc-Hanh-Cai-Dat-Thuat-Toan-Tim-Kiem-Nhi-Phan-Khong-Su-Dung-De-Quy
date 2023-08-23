import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int size;
        Scanner scanner = new Scanner(System.in);
      do {
          System.out.print("Enter the elements: ");
          size = scanner.nextInt();
      } while (size < 0);
      int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the list[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the key: ");
        int key = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (key == arr[i]){
                System.out.println("Index: " + BinarySearch.binarySearch(arr, key));
            } else {
                System.out.println("Do not find key!!!");
                break;
            }
        }
    }
}