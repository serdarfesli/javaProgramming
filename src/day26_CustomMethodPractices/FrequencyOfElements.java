package day26_CustomMethodPractices;

import myUtilities.MyArraysUtility;

public class FrequencyOfElements {
    public static void main(String[] args) {
int[] intArr ={1,2,3,5,5,7,7,7,8,9,15};
String[] strArr={"java","java","python","python","python","java","java",};
        System.out.println(    frequencyOfElement(intArr,3)    );
        System.out.println(   frequencyOfElement(strArr,"pyhton")    );
    }
    public static int frequencyOfElement (int[] intArr,int num){
        int frequency=0;
        for (int each : intArr) {
            if (num==each){
                frequency++;
            }
        }
        return frequency;
    }
    public static int frequencyOfElement (double[] doubleArr,double num){
        int frequency=0;
        for (double each : doubleArr) {
            if (num==each){
                frequency++;
            }
        }
        return frequency;
    }
    public static int frequencyOfElement (char[] charArr,char ch){
        int frequency=0;
        for (int each : charArr) {
            if (ch==each){
                frequency++;
            }
        }
        return frequency;
    }
    public static int frequencyOfElement (String[] StringArr,String str){
        int frequency=0;
        for (String each : StringArr) {
            if (str.equals(each)){
                frequency++;
            }
        }
        return frequency;
    }




}
