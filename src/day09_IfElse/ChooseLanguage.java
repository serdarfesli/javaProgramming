package day09_IfElse;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection = 5;
        String Message;
        if (selection == 1) {
            Message = "Hello, thank for your call";
        } else if (selection == 2) {
            Message = "Hola, gracias para llamar";
        } else if (selection == 3) {
            Message = "Merhaba, aradiginiz icin tesekkurler";
        } else if (selection == 4) {
            Message = "Privet, spasibo za vash zvonok";
        } else {
            Message = "Merci ,pour votre appel";
        }
        System.out.println(Message);
    }
}
