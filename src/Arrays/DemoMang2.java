package Arrays;

public class DemoMang2 {
    public static void main(String[] args) {
        //Khai bao va gan gia tri cho mang
        int number2[] = {5, 7, 10, 20, 30};
        //number2[2] = 100;
        System.out.println("length: " + number2.length);

        for (int i = 0; i < number2.length; i++){
            System.out.println(number2[i]);
        }
        String dataCustomerName[] = {"Ha", "Hong", "Hue"};
        System.out.println(dataCustomerName[0]);//Test lan 1
        System.out.println(dataCustomerName[1]);//Test lan 2
        System.out.println(dataCustomerName[2]);//Test lan 3

        boolean check = true;

        for (int i = 0; i < dataCustomerName.length; i++){

            if(dataCustomerName[i].equals("Hoa")){
                check = true;
                break;
            }else {
                check = false;
            }
        }
        if(check == true){
            System.out.println("Tim thay");
        }else {
            System.out.println("Khong tim thay");
        }

        String dataCustomerAge[] = {"20", "28", "26"};
        System.out.println(dataCustomerAge[0]);//Test lan 1
        System.out.println(dataCustomerAge[1]);//Test lan 2
        System.out.println(dataCustomerAge[2]);//Test lan 3

        System.out.println(dataCustomerName[0]);//Test lan 1
        System.out.println(dataCustomerAge[0]);//Test lan 1
    }
}
