package OrangeHRM;

public class test extends Recruitment {
    public static void main(String[] args) throws InterruptedException {

        Recruitment lg = new Recruitment();
        lg.login();
        lg.adduser();
        Thread.sleep(4000);
        lg.rect();

    }

}
