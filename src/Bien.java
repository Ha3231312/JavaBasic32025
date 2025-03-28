public class Bien {

    String address = "Ha Noi";//đây là biến toàn cục
    static String phone = "0979187593";//day là bien static

    //Hàm thứ 1
    public void sayhello() {
        int n = 10; //đây là biến local
        System.out.println("gia tri cua n la" + n);
        System.out.println(address);
    }

    //Hàm thứ 2
    public void getInfor() {
        System.out.println(address);

    }

    public static void main(String[] args) {

        // cach thuc goi thanh phan cua class vao ham bat ky
        Bien bien = new Bien();
        System.out.println(bien.address);
        //System.out.println(address);//goi tu bien toan cuc
        System.out.println(phone);
        //ghi chú
        //khai bao bien
        int number1 = 123456;
        int number2 = 789;
        String name = "Ha";
        String Ten = "Nhat";
        //in gia tri cua bien ra man hinh
        System.out.println(name);
        System.out.println(number2);
        System.out.println(number1);
    }

}
