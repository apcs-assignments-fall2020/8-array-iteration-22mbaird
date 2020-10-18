public class MyMain {

    // Reverses an array
    public static int[] reverse(final int[] arr) {
        final int[] rlist = new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            rlist[i] = arr[arr.length - 1 - i];
        }
        return rlist;
    }

    // Finds the second largest number in an array
    public static int secondLargest(final int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            int max = arr[0];
            int maxi = 0;
            for (int i = 0; i < arr.length-x; i++) {
                if (arr[i] > max) {
                max = arr[i];
                maxi = i;
                }
            }
            int nmax = max;
            arr[maxi] = arr[arr.length-1-x];
            arr[arr.length-1-x] = nmax;
            

        }
        int sb = arr[arr.length-2];
        return sb;

        

    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(final int[] arr) {
        final double[] factor = new double[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            factor[i] = Double.valueOf(arr[i + 1]) / Double.valueOf(arr[i]);
        }
        int c = 0;
        for (int i = 1; i < factor.length; i++) {
            if (factor[i] == factor[i - 1]) {
                c += 1;
            }
        }

        if (c == factor.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(final String[] args) {
        System.out.println(reverse(null));
        System.out.println(secondLargest(null));
        System.out.println(isGeometric(null));
    }
}
