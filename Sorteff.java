import java.util.Arrays;

public class Sorteff {
    public static void main(String[] args) {
        int[] ip = {1, 3, 2, 5, 4, 7, 10};
        int n = ip.length;
        int[] result = new int[n];
        int oddIndex = 0;
        int evenIndex = n - 1;
        
        for (int num : ip) {
            if (num % 2 != 0) {
                result[oddIndex++] = num;
            } else {
                result[evenIndex--] = num;
            }
        }
        Arrays.sort(result, 0, oddIndex);
        Arrays.sort(result, evenIndex + 1, n);
        
        reverse(result, 0, oddIndex - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

