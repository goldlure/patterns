package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}