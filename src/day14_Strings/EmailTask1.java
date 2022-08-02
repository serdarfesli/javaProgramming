package day14_Strings;

public class EmailTask1 {
    public static void main(String[] args) {
        String eMail1 = "java_kawa@gmail.com";
        String eMail2="";
        int indexUnderscore = eMail1.indexOf('_');
        int indexAtSign = eMail1.indexOf('@');
        if (eMail1.indexOf('_') >= 0) {
            eMail2 = eMail1.substring(indexUnderscore + 1, indexAtSign) + '_' + eMail1.substring(0, indexUnderscore) + "@gmail.com";
        } else{
            eMail2 = eMail1;
        }
        System.out.println("eMail2 = " + eMail2);
    }
}
