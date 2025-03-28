package StaticJava;

public class KhoiTaoDoiTuongClass {
    String name ="Ha";
    static String address = "SO 1";

    public static void main(String[] args) {
        KhoiTaoDoiTuongClass name1 = new KhoiTaoDoiTuongClass();//Tao 1 class moi
        System.out.println(name1.name);
        System.out.println(KhoiTaoDoiTuongClass.address);
    }
}
