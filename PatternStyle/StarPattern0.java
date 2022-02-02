package PatternStyle;

public class StarPattern0 {

    public static void isArmstrongNumber(int num)

    {
        int cube = 0;
        int a = num ;
        while (num > 0) {
            int r = num % 10;
            cube = cube + (r*r*r);
            num = num / 10;

        }

        if (a == cube) {
            System.out.println("This is Armstrong Number");
        } else {
            System.out.println("This is Not Armstrong Number");
        }
    }
    public static void main(String[] args) {
        isArmstrongNumber(153);
        isArmstrongNumber(151);
        isArmstrongNumber(1594);
        isArmstrongNumber(1954);

    }
}
