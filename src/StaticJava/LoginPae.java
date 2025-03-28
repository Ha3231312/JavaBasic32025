package StaticJava;

public class LoginPae {
    public static void main(String[] args) {
        WebUI.openURL("https://anhtester.com");//Lay ten class.Trương thông tin
        WebUI.setText(WebUI.email);
        WebUI.setText(WebUI.password);
        WebUI.clickElement();
    }
}
