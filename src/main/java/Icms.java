public class Icms implements Tax{

    @Override
    public double calculate(Budget budget) {
       return budget.getValue() * 0.1;
    }
}
