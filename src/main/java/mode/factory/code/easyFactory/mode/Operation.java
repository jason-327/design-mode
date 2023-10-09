package mode.factory.code.easyFactory.mode;

/**
 * @author jason
 * @version 1.0
 * @description: 运算抽象类
 * @date 2022/10/18 14:28
 */
public abstract class Operation {

    private Double number_a;// 运算符a
    private Double number_b;// 运算符b

    public abstract Double getResult();

    public Double getNumber_a() {
        return number_a;
    }

    public void setNumber_a(Double number_a) {
        this.number_a = number_a;
    }

    public Double getNumber_b() {
        return number_b;
    }

    public void setNumber_b(Double number_b) {
        this.number_b = number_b;
    }
}

