package day20_Arrays;

public class UniqueElemenetsOfArrays {
    public static void main(String[] args) {

        String [] words = {"Java","Java","C#", "Python","Python"};
        String uniqueElements="";
        for (int i = 0; i < words.length ; i++) {
            int count =0;
            for (int j = 0; j < words.length ; j++) {
                if (words[i].equals(words[j])){
                    count++;
                }
            }
            if (count==1){
                uniqueElements+=words[i];
            }
        }
        System.out.println("uniqueElements = " + uniqueElements);
        }

    }

