//Chanceller Waters
//Module-4.2 Assignment: Overload


import java.util.Arrays;


 class ArrayAveragetest {

     // Overloaded method for short array
     public static short average(short[] array) {
         if (array == null || array.length == 0) return 0;
         long sum = 0; // Use long to prevent integer overflow during accumulation
         for (short val : array) {
             sum += val;
         }
         return (short) (sum / array.length);
     }

     // Overloaded method for long array
     public static long average(long[] array) {
         if (array == null || array.length == 0) return 0L;
         long sum = 0;
         for (long val : array) {
             sum += val;
         }
         return sum / array.length;
     }
     // overloaded method array (Long)
    public static int average(int[] array) {
        if (array == null || array.length == 0) return 0;
        long sum = 0;
        for (int val : array) {
            sum += val;
        }
        return (int) (sum / array.length);
    }


    //Overloaded Method array (double)
    public static double average(double[] array) {
        if (array == null || array.length == 0) return 0.0;
        double sum = 0.0;
        for (double val : array) {
            sum += val;
        }
        return sum / array.length;
    }

    //Test program for arrays


    //short array - Size: 3
    public static void main(String[] args) {


        short[] shortArray = {10, 20, 30};
        System.out.println("\n---------__________--------________");
        System.out.println("Testing short[] Method (Array Size: " + shortArray.length + ")");
        System.out.println("Original Array:" + Arrays.toString(shortArray));
        System.out.println("Returned Average: " + average(shortArray));


        //Int array - Size: 4
        int[] intArray = {100, 250, 400, 550};
        System.out.println("\n---------__________--------________");
        System.out.println("Testing int[] Method (Array Size: " + intArray.length + ")");
        System.out.println("Original Array:" + Arrays.toString(intArray));
        System.out.println("Returned Average: " + average(intArray));


        //Long array - Size: 5
        long[] longArray = {1000L, 2500L, 4000L, 5500L, 7000L};
        System.out.println("\n---------__________--------________");
        System.out.println("Testing long[] Method (Array Size: " + longArray.length + ")");
        System.out.println("Original Array:" + Arrays.toString(longArray));
        System.out.println("Returned Average: " + average(longArray));


        //Double array - Size: 6
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};
        System.out.println("\n---------__________--------________");
        System.out.println("Testing double[] Method (Array Size: " + doubleArray.length + ")");
        System.out.println("Original Array:" + Arrays.toString(doubleArray));
        System.out.println("Returned Average: " + average(doubleArray));
    }

}
