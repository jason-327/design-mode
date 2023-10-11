package mode.strategy;

/**
 * @author jason
 * @version 1.0
 * @description: 返利收费子类
 * @date 2023/10/11 8:48
 */
public class CashReturn extends CashSuper {
    private double moneyConditation = 0.0;
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyConditation, double moneyReturn) {
        this.moneyConditation = moneyConditation;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyConditation) {
            result = money - Math.floor(money / moneyConditation) * moneyReturn;
        }
        return result;
    }
}
