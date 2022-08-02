package day14_Strings;

public class EmailTask2 {
    public static void main(String[] args) {
        String eMail = "elon_musk@tesla.com";
        int indexUnderscore = eMail.indexOf('_'); //
        int indexAtSign = eMail.indexOf('@');
        int indexDot = eMail.indexOf('.');
        String firstName = eMail.substring(0, indexUnderscore); // it returns us the first name with lowercase
        String firstLetterOfName = firstName.substring(0, 1); // returns me the first letter of the name
        firstLetterOfName = firstLetterOfName.toUpperCase(); // returns the first letter as an Upper case
        firstName = firstLetterOfName + firstName.substring(1); // Elon
        String lastName = eMail.substring(indexUnderscore + 1, indexAtSign); // returns me the last name in lower case
        String firstLetterOfLastName = lastName.substring(0, 1); // return the first letter of the last name
        firstLetterOfLastName = firstLetterOfLastName.toUpperCase(); // returns the uppercase format of first letter of last nbame
        lastName = firstLetterOfLastName + lastName.substring(1);
        String domain = eMail.substring(indexAtSign + 1, indexDot); // returns domain
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("domain = " + domain);

    }
}
