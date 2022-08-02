package day19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String w = "dasdajdlkjfldksfjdlsafjdsşlfjlksdjfkldsjlkgjfdlkgjdfglkdjfgmvöçlkgfjdklgjdfgkljlgkjlkdfg";
        String container = "";
        int frequency = 0;

        for (int i = 0; i <= w.length() - 1; i++) {
            frequency = 0;
            for (int j = 0; j <= w.length() - 1; j++) {
                if (w.charAt(i) == w.charAt(j)) {
                    frequency++;
                }
            }
            if (container.contains(w.charAt(i) + "")) {
                continue;
            }
            container += "" + w.charAt(i) + frequency +" ";
        }
        System.out.println(container);
    }
}

