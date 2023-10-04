public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
                singleton.demonstrateFunctionality();
            }).start();
        }
    }
}
