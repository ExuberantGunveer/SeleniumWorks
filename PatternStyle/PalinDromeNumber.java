package PatternStyle;

public class PalinDromeNumber {

public static void mirrorNumber(int num){
    int sum = 0 ;
    int a;
    a= num ;
    while(num<0){ //454 , 45 , 4
        int r = num%10; //4 //5 //4
        sum = (sum*10) + r ;
        num = num/10;//45 ,//4
    }
    if(a==sum){
        System.out.println("This is Palindrome Number");
    }else{
        System.out.println("This is Not Palindrome Number");
    }
}

    public static void main(String[] args) {
        mirrorNumber(151);

    }
}
