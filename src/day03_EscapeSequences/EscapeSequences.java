package day03_EscapeSequences;
/*
Escape Sequences: must be given with double quote
\n: starts a new line
\t: Tab button
\\: it prints one backslash \
\" : it prints double quote symbol "
 */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");

        System.out.println("-------------------------------");
        System.out.println("Hello Cydeo \nHow are you all today? \nIt is nice to see you all! \nWhat class do we have next week? ");
        System.out.println("------------------------------------------");

        System.out.println("\tJava is Cool Programming Language");
        System.out.println("--------------------------------------------");
        System.out.println("/ \\");  //in order to print one back slash we need to give to backward slashes
        System.out.println("--------------------------------------------");
        System.out.println("My favorite TV show is \"Game of Thrones\"");  //in order to print double quote (") we need to type \"

    }


}
