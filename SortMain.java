public class SortMain {
    public static void main(String[] args) {
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        
        Sorter.sort(arr);
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
