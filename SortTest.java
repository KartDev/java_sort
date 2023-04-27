public class SortTest {
    public static void main(String[] args) {
        test(new int[]{3, 2, 1}, new int[]{1, 2, 3});
        test(new int[]{0, -5, 5}, new int[]{-5, 0, 5});
        test(new int[]{7, 5, 3, 1, 9}, new int[]{1, 3, 5, 7, 9});
        test(new int[]{4, -1, 0, 2, -2}, new int[]{-2, -1, 0, 2, 4});
        test(new int[]{10, 20, 30, 40, 50}, new int[]{10, 20, 30, 40, 50});
    }

    private static void test(int[] input, int[] expected) {
        Sorter.sort(input);
        boolean success = true;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != expected[i]) {
                success = false;
                break;
            }
        }
        System.out.println("Test: " + (success ? "PASS" : "FAIL"));
    }
}
