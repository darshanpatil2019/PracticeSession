public class MaxProduct {
    public static void main(String[] args) {
        maxProduct();
    }

    static void maxProduct() {
        int[] arr = {4, 8, 7, 3, 6, 9};
        int firstMax = 0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println("The max 2 numbers is " + (firstMax) + "," + (secondMax));
        System.out.println("The product of max. two numbers is " + ((firstMax) * (secondMax)));
    }
}
