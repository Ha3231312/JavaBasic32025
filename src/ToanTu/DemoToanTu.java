package ToanTu;

public class DemoToanTu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 5;
        double d, e, f;
        //d = e = f = 1000;

        //Toan tu so hoc
        System.out.println("a / b = " + a / b);
        System.out.println("a % b = " + a % b);
        System.out.println(a++);// a=a+1
        System.out.println(a);
        System.out.println(a +=5);//a = a+5
        System.out.println(a + b * c / 5);

        //Toan tu so sanh va logic
        System.out.println("so sanh a > b:" + (a > b));
        System.out.println((a > b) && (b > c));
        System.out.println((a > b) || (b > c) || (a > c) || (b < c));
        System.out.println(((a < b) && ( b > c)) || ((a < b) && ( a < c)));
    }
}
