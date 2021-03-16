package digital.innovation.one.utils;

import digital.innovation.one.utils.interno.DivHelper;
import digital.innovation.one.utils.interno.MultHelper;
import digital.innovation.one.utils.interno.SubHelper;
import digital.innovation.one.utils.interno.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultHelper multHelper;
    private SumHelper sumHelper;
    private SubHelper subHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        multHelper = new MultHelper();
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a, b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a, b);
    }

    public int mult(int a, int b){
        return multHelper.execute(a, b);
    }

    public int div(int a, int b){
        return divHelper.execute(a, b);
    }
}
