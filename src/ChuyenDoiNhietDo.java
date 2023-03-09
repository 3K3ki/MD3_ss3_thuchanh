import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double F;
        double C;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Độ F to C");
            System.out.println("2. Độ C to F");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn:  ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhập Độ F: ");
                    F = input.nextDouble();
                    System.out.println("Độ F to C: " + fahrenheitToCelsius(F));
                    break;
                }
                case 2: {
                    System.out.println("Nhập Độ C: ");
                    C = input.nextDouble();
                    System.out.println("Độ C to F: " + celsiusToFahrenheit(C));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double F = (9.0 / 5) * celsius + 32;
        return F;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double C = (5.0 / 9) * (fahrenheit - 32);
        return C;
    }
}
