package day18_NestedLoop;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int j = 1; j <=10 ; j++) {     //j=1 ,j=2
            for ( int i = 1; i <=10 ; i++) {   // i= 1,2,3,4......

                System.out.print(j*i + " "); //  1,2,3,4,5,.....
                                             //   2,4,6,8,......
            }
            System.out.println();
        }
    }
}
