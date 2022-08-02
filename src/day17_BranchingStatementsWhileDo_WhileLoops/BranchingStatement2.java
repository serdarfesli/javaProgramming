package day17_BranchingStatementsWhileDo_WhileLoops;

public class BranchingStatement2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            if (i == 'C') {
                continue;
            }
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---------------");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
