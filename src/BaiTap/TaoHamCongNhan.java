package BaiTap;

public class TaoHamCongNhan {

    public int cong2So(int a, int b){
        return (a+b);// viết Hàm nên để trên hàm Main hàm Man là hàm chạy nên để sau cùng
    }

    public double tich2SoThuc(double a, double b){
        return (a * b);// viết Hàm nên để trên hàm Main hàm Man là hàm chạy nên để sau cùng
    }

    public static void main(String[] args) {
        TaoHamCongNhan cacul = new TaoHamCongNhan();
        System.out.println(cacul.cong2So(10, 20));
        System.out.println(cacul.tich2SoThuc(5,10));;

    }
}
