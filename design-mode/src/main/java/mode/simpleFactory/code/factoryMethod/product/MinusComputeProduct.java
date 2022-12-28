package mode.simpleFactory.code.factoryMethod.product;

/**
 * @author jason
 * @version 1.0
 * @description: TODO
 * @date 2022/12/12 10:43
 */
public class MinusComputeProduct extends ComputeProduct {

    @Override
    public Double getComputeResult() {
        return numbereA - numbereB;
    }
}
