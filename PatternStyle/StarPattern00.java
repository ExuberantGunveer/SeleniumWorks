package PatternStyle;

public class StarPattern00 {

    public static void isArmsStrongNumber(int num){

        int cube = 0;
        int a ;
        a=num;
        while(num>0){
            int r = num % 10;
            cube = cube  + (r*r*r);
            num = num/10;
        }
        if(a==cube){
            System.out.println("This Number is Armstrong Number:");
        }else{
            System.out.println("This Number is Not Armstrong Number");
        }
    }


    public static void main(String[] args) {
        isArmsStrongNumber(153);
        isArmsStrongNumber(455);
        isArmsStrongNumber(407);
        isArmsStrongNumber(111);
    }

}
