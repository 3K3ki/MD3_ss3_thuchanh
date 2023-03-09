import java.util.Scanner;

public class GiaTriNhoNhatArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a array size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size must < 20");
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print(" list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j]< array[index] ) {
                min= array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest is " + min + " ,at" + index);
    }
}
