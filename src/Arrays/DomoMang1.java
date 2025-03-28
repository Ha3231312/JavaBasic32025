package Arrays;

public class DomoMang1 {
    public static void main(String[] args) {
        //Khai bao rong chua mang gia tri
        int number1[] = new int[6];
        //gan gia tri cho mang
        number1[0] = 40;
        number1[1] = 4;
        number1[2] = 3;
        number1[3] = 5;
        number1[4] = 10;
        System.out.println("DO dai mang: " + number1.length);

        System.out.println(number1[4]);
        System.out.println("------------------------");
        //Duyet mang de lay gia tri ra
        for (int i = 0; i < number1.length; i++){
            System.out.println(number1[i]);
        }
        System.out.println("------------------------");
        for (int i = 2; i < 5; i++){
            System.out.println(number1[i]);
        }
        System.out.println("------------------------");
        for (int number : number1){
            System.out.println(number);
        }
    }
}
