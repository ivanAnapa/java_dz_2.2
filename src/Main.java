public class Main {
    public static void main(String[] args) {

        int initialBalance = 1230;
        int paymentSum = 12_345;
        int balanceAfterPayment;
        int minPaymentForBonus = 1000;
        int paymentSumForEveryBonus = 100;
        int bonusForPayment;

        if (paymentSum >= minPaymentForBonus) {
            bonusForPayment = paymentSum / paymentSumForEveryBonus;
            balanceAfterPayment = initialBalance + paymentSum + bonusForPayment;
            System.out.println("Итоговый баланс: " + balanceAfterPayment + ", в т.ч. бонусов:  " + bonusForPayment);
        } else {
            balanceAfterPayment = initialBalance + paymentSum;
            System.out.println("Итоговый баланс: " + balanceAfterPayment);
        }

    }
}
