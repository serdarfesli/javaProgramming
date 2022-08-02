package day20_Arrays;

public class reversedClassmates {
    public static void main(String[] args) {
        String[] classmates = {"Ali", "Veli", "James", "Ahmet", "Mehmet", "Kadir", "Yaşar", "Durmuş", "Jenny", "Ally"};

        String reversed = "";
        for (int j = 0; j < classmates.length; j++) {
            reversed = "";
            for (int i = classmates[j].length() - 1; i >= 0; i--) {
                reversed += "" + classmates[j].charAt(i);
            }
            System.out.println(reversed);
        }

    }
}

