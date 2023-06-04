public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        int balance = 100;
        int recharge = 300;
        int limit = 1000;
        int bonus = 0;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        if (recharge > limit) {
            bonus = bonus + recharge / 100;
            balance = balance + recharge + bonus;
            System.out.println("Ваш бонус: " + bonus);
            System.out.println("Ваш баланс: " + balance);
        } else {
            balance = balance + recharge;
            System.out.println("Ваш бонус: " + bonus);
            System.out.println("Ваш баланс: " + balance);
        }
    }
}