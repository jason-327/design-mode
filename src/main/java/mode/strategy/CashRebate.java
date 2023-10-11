package mode.strategy;

/**
 * @author jason
 * @version 1.0
 * @description: 打折收费子类
 * @date 2023/10/11 8:46
 */
public class CashRebate extends CashSuper {
    private double moneyRebate = 0.8;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}