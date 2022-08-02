package day36_Inheritance.tasks.book;

public class BookObjects {
    public static void main(String[] args) {

        EBook eBook1 = new EBook();
        eBook1.setInfo("Miserables","drama","Victor Hugo",100);
        eBook1.setInfo("large",100);
        System.out.println(eBook1);
        AudioBook audioBook1 = new AudioBook();
        audioBook1.narrator="Chriss";
        audioBook1.setInfo("Chess","audio","Zweig",10);
        audioBook1.setInfo(20,"Barış Özcan");
        System.out.println(audioBook1);
        audioBook1.listen();

    }
}
