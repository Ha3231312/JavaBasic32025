package BaiTap;

public class ArrayLayRaSoChan {
    public static void main(String[] args) {
        int mangSoNguyen[] = new int[26];//B1 Khởi tạo mảng
        int index = 0;



        for (int i = 0; i < 50; i++){
            if(i % 2 == 0){
                //System.out.print(i + " ");
                mangSoNguyen[index] = i;//Gắn giá tri số chẵn vào trị trí này
                index++;//Tăng biến chỉ mục lên 1 đơn vị
            }
        }
        //Duyệt mảng
        for (int value: mangSoNguyen){
            System.out.println(value);
        }
    }
}
