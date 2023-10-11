package mode.strategy;

/**
 * @author jason
 * @version 1.0
 * @description: 策略类，为抽象类，抽象出收费的方法供子类实现。
 * @date 2023/10/11 8:45
 */
public abstract class CashSuper {
    public abstract double acceptCash(double money);
}
