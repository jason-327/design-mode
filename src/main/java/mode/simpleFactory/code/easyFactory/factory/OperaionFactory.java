package mode.simpleFactory.code.easyFactory.factory;

import mode.simpleFactory.code.easyFactory.mode.Operation;
import mode.simpleFactory.code.easyFactory.mode.OperationMinus;
import mode.simpleFactory.code.easyFactory.mode.OperationAdd;

/**
 * @author jason
 * @version 1.0
 * @description: 运算简单工厂
 * @date 2022/10/18 14:38
 */
public class OperaionFactory {

    public static Operation createOperaion(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationMinus();
                break;
        }

        return operation;
    }
}
