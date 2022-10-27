package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int thousands = (int) number / 1000;
        int hundreds = (int) (number - thousands * 1000) / 100;
        int dozens = (int) (number - thousands * 1000 - hundreds * 100) / 10;
        int units = (int) (number - thousands * 1000 - hundreds * 100 - dozens * 10);
        System.out.println(thousands+ hundreds + dozens + units);
    }
}
