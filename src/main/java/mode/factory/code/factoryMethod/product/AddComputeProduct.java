package mode.factory.code.factoryMethod.product;

/**
 * @author jason
 * @version 1.0
 * @description: TODO
 * @date 2022/12/12 10:42
 */
public class AddComputeProduct extends ComputeProduct {

    @Override
    public Double getComputeResult() {
        return numbereA + numbereB;
    }
}
