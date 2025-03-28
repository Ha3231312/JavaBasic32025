package StaticJava;

public class WebUI {

    public static String url = "https://anhtester.com";
    public static String email = "admin@gmail.com";
    public static String password = "Login button";

    public static void openURL(String url){
        System.out.println(url);
    }
    public static void clickElement(){
        System.out.println("Click element: ");
    }

    public static void setText(String text){
        System.out.println("Set text: " + text);
    }

    public static String getElementText(String elementName){
        return "text";
    }

    public static void main(String[] args) {
        openURL(url);
        setText(email);
        setText(password);
        clickElement();
    }


}