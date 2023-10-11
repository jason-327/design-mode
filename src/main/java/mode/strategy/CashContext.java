package mode.strategy;

/**
 * @author jason
 * @version 1.0
 * @description: 金额类上下文
 * @date 2023/10/11 8:45
 */
public class CashContext {
    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }
}
