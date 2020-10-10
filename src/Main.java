public class Main {
    public static void main(String[] args) {
        BankService service = new BankService();
        double depositResult=service.deposit(2.5,300_000);
        System.out.println("Ваш доход по вкладу "+depositResult);
        int cashbackResult=service.cashback(3200,4300,2000);
        System.out.println("Ваш кэшбек "+cashbackResult);
    }
}
