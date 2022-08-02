package day27_WrapperClasses;

public class Day27Task03RetrieveLetters {
    public static void main(String[] args) {

        String str = "Wooden Spoon!";
        String contLetter = "";
        String contDigits = "";
        String contSpecialChars = "";

        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)==true){
                contLetter+=""+each;
            } else if (Character.isDigit(each)==true){
                contDigits+=""+each;
            } else {
                contSpecialChars+=""+each;
            }
        }
        System.out.println("contLetter = " + contLetter);
        System.out.println("contDigits = " + contDigits);
        System.out.println("contSpecialChars = " + contSpecialChars);
    }
}
