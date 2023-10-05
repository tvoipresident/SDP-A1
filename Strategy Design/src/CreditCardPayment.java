class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using credit card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
}

class ApplePay implements PaymentStrategy {
    private String email;

    public ApplePay(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using ApplePay " + email);
    }
}
