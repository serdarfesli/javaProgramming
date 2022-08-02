package day25_CustomMethods_Overloading;

public class MethodOverloadTask3_MinNumberFromArray {
    public static void main(String[] args) {
        System.out.println(minNumOfArray(new double[]{1, 2, 3, 4, 5}));
        System.out.println(minNumOfArray(new int[]{1, 2, 3, 4, 5}));
        System.out.println(minNumOfArray(new float[]{1, 2, 3, 4, 5}));
    }

    public static int minNumOfArray(int[] intArr) {
        int minNum = intArr[0];
        for (int each : intArr) {
            if (each < minNum) {
                minNum = each;
            }
        }
        return minNum;
    }

    public static double minNumOfArray(double[] doubleArr) {
        double minNum = doubleArr[0];
        for (double each : doubleArr) {
            if (each < minNum) {
                minNum = each;
            }
        }
        return minNum;
    }

    public static long minNumOfArray(long[] longArr) {
        long minNum = longArr[0];
        for (long each : longArr) {
            if (each < minNum) {
                minNum = each;
            }
        }
        return minNum;
    }

    public static short minNumOfArray(short[] shortArr) {
        short minNum = shortArr[0];
        for (short each : shortArr) {
            if (each < minNum) {
                minNum = each;
            }
        }
        return minNum;
    }

    public static float minNumOfArray(float[] floatArr) {
        float minNum = floatArr[0];
        for (float each : floatArr) {
            if (each < minNum) {
                minNum = each;
            }
        }
        return minNum;
    }

    public static byte minNumOfArray(byte[] byteArr) {
        byte minNum = byteArr[0];
        for (byte each : byteArr) {
            if (each < minNum) {
                minNum = each;
            }
        }
        return minNum;
    }
}
