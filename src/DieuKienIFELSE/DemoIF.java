package DieuKienIFELSE;

public class DemoIF {
    public static void main(String[] args) {
        int age = 20;
        String address = "Can Tho";
        String header = "login CMS page";

        //SO sanh bang trong chuoi dung hang equals
        //So sanh chưa trong chuoi dung ham contains

        if (age > 18 && address.equals("Can "))
        {
            System.out.println("Bắt đi NVQS");
        }

        if (header.contains("Login")){
            System.out.println("Đã đến được trang login");
        }
    }
}
