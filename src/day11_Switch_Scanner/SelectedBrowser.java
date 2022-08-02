package day11_Switch_Scanner;

public class SelectedBrowser {
    public static void main(String[] args) {
        String browserName= "chrome2";
        String result;
        switch (browserName){
            case "chrome":
                result=browserName;
                break;
            case "firefox":
                result=browserName;
                break;
            case "opera":
                result=browserName;
                break;
            case "safari":
                result=browserName;
                break;
            case "edge":
                result=browserName;
                break;
            default:
                result="Invalid Browser";
        }
        System.out.println(result);

    }
}
