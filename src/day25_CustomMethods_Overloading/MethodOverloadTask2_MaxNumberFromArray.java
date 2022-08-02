package day25_CustomMethods_Overloading;

public class MethodOverloadTask2_MaxNumberFromArray {
    public static void main(String[] args) {
        System.out.println(maxNumOfArray(new double[]{1, 2, 3, 4, 5}));
        System.out.println(maxNumOfArray(new int[]{1, 2, 3, 4, 5}));
        System.out.println(maxNumOfArray(new float[]{1, 2, 3, 4, 5}));
    }

    public static int maxNumOfArray(int[] intArr) {
        int maxNum = intArr[0];
        for (int each : intArr) {
            if (each > maxNum) {
                maxNum = each;
            }
        }
        return maxNum;
    }

    public static double maxNumOfArray(double[] doubleArr) {
        double maxNum = doubleArr[0];
        for (double each : doubleArr) {
            if (each > maxNum) {
                maxNum = each;
            }
        }
        return maxNum;
    }

    public static long maxNumOfArray(long[] longArr) {
        long maxNum = longArr[0];
        for (long each : longArr) {
            if (each > maxNum) {
                maxNum = each;
            }
        }
        return maxNum;
    }

    public static short maxNumOfArray(short[] shortArr) {
        short maxNum = shortArr[0];
        for (short each : shortArr) {
            if (each > maxNum) {
                maxNum = each;
            }
        }
        return maxNum;
    }

    public static float maxNumOfArray(float[] floatArr) {
        float maxNum = floatArr[0];
        for (float each : floatArr) {
            if (each > maxNum) {
                maxNum = each;
            }
        }
        return maxNum;
    }

    public static byte maxNumOfArray(byte[] byteArr) {
        byte maxNum = byteArr[0];
        for (byte each : byteArr) {
            if (each > maxNum) {
                maxNum = each;
            }
        }
        return maxNum;
    }
}
