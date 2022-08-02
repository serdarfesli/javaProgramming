package day26_CustomMethodPractices;

import myUtilities.MyArraysUtility;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr1= {1,2,2,2,6,6,6,6,3,4,4,5,5};
        String[] arr2={"I","I","love","java","java","programming","language"};
     MyArraysUtility.printWholeArray( uniqueElements( new int[] {1,2,2,2,6,6,6,6,3,4,4,5,5} ));
    MyArraysUtility.printWholeArray( MyArraysUtility.uniqueElements(new int[] {1,2,2,2,6,6,6,6,3,4,4,5,5}));
    }
    public static int[] uniqueElements (int[] intArr){
        int[] uniqueElements={};
        for (int each : intArr) {
            if (MyArraysUtility.frequencyOfElement(intArr,each)==1){
               uniqueElements= MyArraysUtility.addElement(uniqueElements,each);
            }
        }
            return uniqueElements;

    }




}
