package mode.simpleFactory.code.factoryMethod.product;

/**
 * @author jason
 * @version 1.0
 * @description: 计算产品抽象类
 * @date 2022/12/12 10:26
 */
public abstract class ComputeProduct {

    public Double numbereA;

    public Double numbereB;

    /**
     * 获取计算结果（产品1）
     */
    public abstract Double getComputeResult();

    public Double getNumbereA() {
        return numbereA;
    }

    public void setNumbereA(Double numbereA) {
        this.numbereA = numbereA;
    }

    public Double getNumbereB() {
        return numbereB;
    }

    public void setNumbereB(Double numbereB) {
        this.numbereB = numbereB;
    }
}
