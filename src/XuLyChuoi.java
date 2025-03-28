public class XuLyChuoi {
    public static void main(String[] args) {

        String s1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";
        String s2 = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut ";



        //Chuỗi bắt đầu từ 0, tính khoảng trắng là 1 ký tự
        //Cắt chuối
        System.out.println(s1.substring(10));
        System.out.println(s1.substring(6, 10));

        //Ghép chuỗi
        System.out.println(s1 + "--" + s2);

        //Chuyển kiểu in hoa thường
        System.out.println(s2.toLowerCase());//Chữ thường
        System.out.println(s2.toUpperCase());//Chu in Hoa


        //Xóa ký tu khoảng trắng 2 đầu
        String s3 = "         Test automation       ";
        System.out.println(s3.trim());


        //Độ dài chỗi
        System.out.println("Độ dài chuỗi: " + s1.length());



        //Tìm kiếm ký tự
        System.out.println(s1.charAt(10));
        System.out.println(s1.indexOf("m"));



        //So sánh chuỗi
        //+ So sánh bằng
        String s4 = "Test Automation";
        String s5 = "Test automation";
        System.out.println(s5.equals(s4));



        //+ So sánh chứa
        System.out.println(s4.contains("Automation"));

        //So sánh bỏ qua hoa tường
        System.out.println(s4.equalsIgnoreCase(s5));
    }
}
