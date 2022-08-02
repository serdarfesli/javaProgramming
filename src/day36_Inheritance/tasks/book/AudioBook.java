package day36_Inheritance.tasks.book;

public class AudioBook extends Book {
    public int length;
    public String narrator;

    public void setInfo(int length, String narrator) {
        this.length = length;
        this.narrator = narrator;
    }
    public void listen(){
        System.out.println(title + " is being listened now");
    }

    public String toString() {
        return "AudioBook{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                " ,length=" + length +
        ", narrator='" + narrator + '\'' +
                '}';
    }
}
