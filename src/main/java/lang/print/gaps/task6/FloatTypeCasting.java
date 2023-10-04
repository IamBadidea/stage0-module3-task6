package lang.print.gaps.task6;

public class FloatTypeCasting {
    public static void main(String[] args) {
        FloatTypeCasting fc = new FloatTypeCasting();
        fc.roundNumber(30.50f);
    }
    public void roundNumber(float numberToBeRounded) {
        System.out.println(Math.round(numberToBeRounded));
    }
}
