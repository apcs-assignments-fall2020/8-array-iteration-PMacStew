public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) 
            result[arr.length - i - 1] = arr[i];
        return result;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int largest1 = -1000000000;
        int largest2 = -1000000000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest1) {
                largest2 = largest1;
                largest1 = arr[i];
            }
            else if (arr[i] < largest1 && arr[i] > largest2) 
                largest2 = arr[i];
        }
        return largest2;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        double factor = 0.0;
        if (arr.length > 1)
            factor = (double) arr[1] / (double) arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] *  factor != (double) arr[i + 1])
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        
    }
}
