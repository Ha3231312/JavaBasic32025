package BaiTap;

public class Company {
    public double sum;// viết Hàm nên để trên hàm Main hàm Man là hàm chạy nên để sau cùng
    public void cong2So(){
        int a = 10;
        int b = 5;
        sum = a + b;
        //double sum = a + b;
    }

    public static void main(String[] args) {
        Company name1 = new Company();
        name1.cong2So();//phai goi ham cong2So trươc khi in moi tra ve kd theo phep tinh
        System.out.println(name1.sum);
    }
}
