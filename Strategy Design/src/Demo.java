import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addProduct(new Product(name, price, quantity));
                    break;
                case 2:
                    cart.displayCart();
                    break;
                case 3:
                    System.out.println("Select payment method:");
                    System.out.println("1. Credit Card");
                    System.out.println("2. ApplePay");
                    int paymentChoice = scanner.nextInt();
                    PaymentStrategy paymentStrategy;
                    if (paymentChoice == 1) {
                        System.out.print("Enter credit card number: ");
                        String cardNumber = scanner.next();
                        paymentStrategy = new CreditCardPayment(cardNumber);
                    } else if (paymentChoice == 2) {
                        System.out.print("Enter ApplePay email: ");
                        String email = scanner.next();
                        paymentStrategy = new ApplePay(email);
                    } else {
                        System.out.println("Invalid choice");
                        continue;
                    }
                    cart.checkout(paymentStrategy);
                    break;
                case 4:
                    System.out.println("Thank you for shopping with us!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
