import java.sql.SQLOutput;

public class PhuongThuc {

    public double sum;
    public double res;
    //Ham khong tra ve ket qua
    public void cong2So(){
        int a = 5;
        int b = 10;
        sum = a + b;
        System.out.println(sum);
    }
    public void cong2So(int number1, int number2){
        System.out.println(number1 + number2);

    }

    public void loginCRM(){
        System.out.println("Navigate to URL");
        System.out.println("Enter email and password");
        System.out.println("Click login button");
        System.out.println("Verify login success");
    }
    //Ham co tra ve ket qua
    public double nhan2So(){
        int a = 5;
        int b = 10;
        res = a * b;
        return res;

    }

    public long nhan3So(int a, int b, int c){
        return a * b * c;
    }
     //Ham co tham so
    public static void main(String[] args) {
        PhuongThuc phuongThuc = new PhuongThuc();
        phuongThuc.cong2So();
        phuongThuc.nhan2So();
        phuongThuc.loginCRM();
        phuongThuc.cong2So(30, 60);
        System.out.println(phuongThuc.nhan3So(2, 5, 20) / 5);
        //System.out.println(phuongThuc.cong2So() + 5);
        System.out.println(phuongThuc.nhan2So() + 10);


    }
}
