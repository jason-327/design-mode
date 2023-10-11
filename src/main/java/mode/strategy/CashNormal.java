package mode.strategy;

/**
 * @author jason
 * @version 1.0
 * @description: 正常收费子类
 * @date 2023/10/11 8:46
 */
public class CashNormal extends CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
