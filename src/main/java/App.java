public class App {

    public static void main(String[] args) throws Exception {
        CurrencyController controller = new CurrencyController();
        System.out.println(controller.getRate("GBP", 100));


    }
}
