public class Chat {
    public static void main(String[] args) {
        int ip1 = 800;
        int ip2 = 2456;

        System.out.println("Input: " + ip1);
        calculateCurrency(ip1);

        System.out.println("\nInput: " + ip2);
        calculateCurrency(ip2);
    }

    private static void calculateCurrency(int ip) {
        int[] curr = {2000, 500, 200, 100, 50, 20, 10, 5, 1};
        int[] ind = new int[curr.length]; // Initialize with zeros

        int i = 0;
        while (ip > 0) {
            if (ip >= curr[i]) {
                ip -= curr[i];
                ind[i]++;
            } else {
                i++;
            }
        }

        System.out.println("Currency  Count");
        for (i = 0; i < curr.length; i++) {
            if (ind[i] > 0) {
                System.out.println(curr[i] + " : " + ind[i]);
            }
        }
    }
}
