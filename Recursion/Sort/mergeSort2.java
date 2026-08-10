
// Merge Sort using Index / Range
// Temporary array is used only during merging

class Main {

    static void mergeSort(int arr[], int s, int e) {

        // Base condition:
        // Agar range mein sirf 1 element hai,
        // toh array already sorted hai
        if (e - s == 1) {
            return;
        }

        // Middle index nikalenge array ko divide karne ke liye
        int mid = s + (e - s) / 2;

        // Left half ko recursively sort karenge
        mergeSort(arr, s, mid);

        // Right half ko recursively sort karenge
        mergeSort(arr, mid, e);

        // Dono sorted halves ko merge karenge
        merge(arr, s, mid, e);
    }

    static void merge(int arr[], int s, int mid, int e) {

        // i -> left half ko point karega
        // j -> right half ko point karega
        int i = s;
        int j = mid;

        // Merged sorted elements store karne ke liye temporary array
        int mix[] = new int[e - s];

        // mix[] ka pointer
        int k = 0;

        // Dono halves ke elements ko compare karenge
        // aur smaller element ko mix[] mein daalenge
        while (i < mid && j < e) {

            if (arr[i] <= arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }

            k++;
        }

        // Agar left half mein elements bach gaye hain
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        // Agar right half mein elements bach gaye hain
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // mix[] ke sorted elements ko original array mein copy karenge
        for (int x = 0; x < mix.length; x++) {
            arr[s + x] = mix[x];
        }
    }

    public static void main(String[] args) {

        int arr[] = {7, 3, 1, 5, 4};

        // Array ko Merge Sort se sort karenge
        mergeSort(arr, 0, arr.length);

        // Sorted array print karenge
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
