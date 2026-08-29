public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 41, 77, 9};

        int largest = arr[0];
        int sLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];

            } else if (arr[i] > sLargest && arr[i] != largest) {
                sLargest = arr[i];
            }
        }

        System.out.println(sLargest);
    }
}



