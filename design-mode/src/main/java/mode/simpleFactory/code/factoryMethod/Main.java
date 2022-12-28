package mode.simpleFactory.code.factoryMethod;

import mode.simpleFactory.code.factoryMethod.factory.AddComputeFactory;
import mode.simpleFactory.code.factoryMethod.factory.ComputeFactory;
import mode.simpleFactory.code.factoryMethod.product.ComputeProduct;

/**
 * @author jason
 * @version 1.0
 * @description: TODO
 * @date 2022/12/12 10:47
 */
public class Main {

    public static void main(String[] args) {
        ComputeFactory computeFactory = new AddComputeFactory();
        ComputeProduct computeProduct = computeFactory.getComputeProduct();
        computeProduct.setNumbereA(1D);
        computeProduct.setNumbereB(2D);
        System.out.println(computeProduct.getComputeResult());
    }
}
