public class duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 2, 5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    boolean found = false;
                    for (int k = 0; k < i; k++) {
                        if (arr[k] == arr[i]) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.print(arr[i] + " ");
                    }
                    break;
                }
            }
        }
    }
}
