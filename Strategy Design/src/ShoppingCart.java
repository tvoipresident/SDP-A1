import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    public void checkout(PaymentStrategy paymentStrategy) {
        double total = calculateTotalPrice();
        paymentStrategy.processPayment(total);
    }

    public void displayCart() {
        System.out.println("Cart Contents:");
        for (Product product : products) {
            System.out.println(product.getName() + " - $" + product.getPrice() + " - Quantity: " + product.getQuantity());
        }
    }
}
