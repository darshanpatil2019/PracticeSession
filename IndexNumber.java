import java.util.Scanner;

public class IndexNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 10, 13, 20, 24, 89};

        System.out.println("Please enter a Number : ");
        int num = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
            }
        }
        System.out.println("The Number is present at index : " + index);
    }
}

