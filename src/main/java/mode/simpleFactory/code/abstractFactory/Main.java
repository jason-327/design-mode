package mode.simpleFactory.code.abstractFactory;

import mode.simpleFactory.code.abstractFactory.factory.PhoneFactory;
import mode.simpleFactory.code.abstractFactory.factory.XiaoMiPhoneFactory;
import mode.simpleFactory.code.abstractFactory.product.*;

/**
 * @author jason
 * @version 1.0
 * @description: TODO
 * @date 2022/12/12 11:47
 */
public class Main {

    public static void main(String[] args) {
        PhoneFactory phoneFactory = new XiaoMiPhoneFactory();
        AbstractEjProduct ejProduct = phoneFactory.getEjProduct();
        ejProduct.ejProduct();
        AbstractSjxProduct sjxProduct = phoneFactory.getSjxProduct();
        sjxProduct.sjxProduct();
    }
}


