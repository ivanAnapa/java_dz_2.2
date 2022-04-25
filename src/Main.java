public class Main {
    public static void main(String[] args) {

        /**
         Один из сотовых операторов решил сделать своим клиентам приятный бонус: если клиент пополняет счёт
         более чем на 1000 рублей, то сотовый оператор дарит ему по 1 рублю за каждые полные 100 рублей пополнения.
         Примеры.
         Начальные данные: у клиента на счёте 100 рублей.
         Клиент пополнил счёт на 100 рублей - бонусов нет, итоговая сумма на счету клиента - 200 рублей
         Клиент пополнил счёт на 1100 рублей - бонус равен 11 рублям, итоговая сумма на счету клиента - 1211 рублей
         Ваша задача
         Создать приложение, выводящее итоговый счёт и количество бонусных рублей.
         Количество денег на текущем счёте клиента и сумму пополнения вы выбираете сами
         (сами создайте переменные, в которых эти данные будут храниться).

         Приложение должно быть написано так, чтобы при замене значений переменных
         (начальной суммы счёта и суммы пополнения), итоговый счёт и бонусные рубли расчитывались правильно.

         Пример схемы кода вашего приложения:

         // Объявляете переменные для входных данных и
         // параметров программы: начального счёта,
         // суммы пополнения и тп

         // Условным оператором проверяете превысила ли
         // сумма пополнения порог и для этих двух разных
         // сценариев рассчитываете сумму бонуса и выводите
         // на экран.

         */

        int initialBalans = 100;
        int firstPayment = 100;
        int balanceAfterPayment;
        int secondPayment = 1100;
        int minPaymentForBonus = 1000;
        int minBonusesForPayment = 10;
        int calculatedBonusForPayment;
        int finalBalance;

        // Calculations for the first payment
        if (firstPayment >= minPaymentForBonus) {
            calculatedBonusForPayment = firstPayment / minBonusesForPayment;
            balanceAfterPayment = initialBalans + firstPayment + calculatedBonusForPayment;
            System.out.println("Баланс после первого платежа: " + balanceAfterPayment + ", в т.ч. бонусов:  "
                    + calculatedBonusForPayment);
        } else {
            balanceAfterPayment = initialBalans + firstPayment;
            System.out.println("Баланс после первого платежа: " + balanceAfterPayment);
        }

        //System.out.println("Количество бонусных миль со стоимости билета: " + totalBonusMiles);

    }
}
