import java.util.Scanner;

public class CalcOverload {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Choose operation:");
        System.out.println("1. Add two integers");
        System.out.println("2. Add three integers");
        System.out.println("3. Add two doubles");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter first integer: ");
                int x = scanner.nextInt();
                System.out.print("Enter second integer: ");
                int y = scanner.nextInt();
                System.out.println("Result: " + calc.add(x, y));
            }
            case 2 -> {
                System.out.print("Enter first integer: ");
                int x = scanner.nextInt();
                System.out.print("Enter second integer: ");
                int y = scanner.nextInt();
                System.out.print("Enter third integer: ");
                int z = scanner.nextInt();
                System.out.println("Result: " + calc.add(x, y, z));
            }
            case 3 -> {
                System.out.print("Enter first double: ");
                double x = scanner.nextDouble();
                System.out.print("Enter second double: ");
                double y = scanner.nextDouble();
                System.out.println("Result: " + calc.add(x, y));
            }
            default -> System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}