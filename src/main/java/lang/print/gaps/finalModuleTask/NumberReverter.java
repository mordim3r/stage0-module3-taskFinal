package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int hundred = number/100;
        int tens = (number/10)%10;
        int ones = number%10;
        System.out.println(ones*100+tens*10+hundred);
    }
}
