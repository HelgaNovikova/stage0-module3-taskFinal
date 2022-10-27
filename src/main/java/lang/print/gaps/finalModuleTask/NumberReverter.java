package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int hundreds = (int) number / 100;
        int dozens = (int) (number - hundreds * 100) / 10;
        int units = (int) (number - hundreds * 100 - dozens * 10);
        int newNumber = units * 100 + dozens * 10 + hundreds;
        System.out.println(newNumber);
    }
}
