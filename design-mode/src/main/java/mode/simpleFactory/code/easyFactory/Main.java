package mode.simpleFactory.code.easyFactory;

import mode.simpleFactory.code.easyFactory.factory.OperaionFactory;
import mode.simpleFactory.code.easyFactory.mode.Operation;

/**
 * @author jason
 * @version 1.0
 * @description: TODO
 * @date 2022/12/14 9:36
 */
public class Main {

    public static void main(String[] args) {
        Operation operaion = OperaionFactory.createOperaion("+");
        operaion.setNumber_a(10D);
        operaion.setNumber_b(8D);
        Double result = operaion.getResult();
        System.out.println(result);
    }
}
