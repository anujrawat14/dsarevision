// class Main {

//     // Normal recursive Binary Search on a sorted array
//     static int Bs(int[] arr, int l, int r, int target) {

//         // Base case: target not found
//         if (l > r) {
//             return -1;
//         }

//         // Calculate middle index
//         int mid = l + (r - l) / 2;

//         // Target found
//         if (arr[mid] == target) {
//             return mid;
//         }

//         // Search in left half
//         if (arr[mid] > target) {
//             return Bs(arr, l, mid - 1, target);
//         }

//         // Search in right half
//         return Bs(arr, mid + 1, r, target);
//     }

//     // Recursive Binary Search on Rotated Sorted Array
//     static int RBs(int[] arr, int l, int r, int target) {

//         // Base case: target not present
//         if (l > r) {
//             return -1;
//         }

//         // Calculate middle index
//         int mid = l + (r - l) / 2;

//         // Target found
//         if (arr[mid] == target) {
//             return mid;
//         }

//         // ---------------- Left Half Sorted ----------------
//         if (arr[l] <= arr[mid]) {

//             // Target lies inside the sorted left half
//             if (target >= arr[l] && target < arr[mid]) {
//                 return Bs(arr, l, mid - 1, target);
//             }

//             // Otherwise search in the rotated right half
//             return RBs(arr, mid + 1, r, target);
//         }

//         // ---------------- Right Half Sorted ----------------

//         // Target lies inside the sorted right half
//         if (target > arr[mid] && target <= arr[r]) {
//             return Bs(arr, mid + 1, r, target);
//         }

//         // Otherwise search in the rotated left half
//         return RBs(arr, l, mid - 1, target);
//     }

//     public static void main(String[] args) {

//         int[] arr = {4, 5, 6, 7, 0, 1, 2};
//         int target = 0;

//         System.out.println(RBs(arr, 0, arr.length - 1, target));
//     }
// }
class Main {

    // Normal recursive Binary Search on a sorted array

    // Recursive Binary Search on Rotated Sorted Array
    static int search(int[] arr, int l, int r, int target) {

        // Base case: target not present
        if (l > r) {
            return -1;
        }

        // Calculate middle index
        int mid = l + (r - l) / 2;

        // Target found
        if (arr[mid] == target) {
            return mid;
        }

        // ---------------- Left Half Sorted ----------------
        if (arr[l] <= arr[mid]) {

            // Target lies inside the sorted left half
            if (target >= arr[l] && target < arr[mid]) {
                return search(arr, l, mid - 1, target);
            }

            // Otherwise search in the rotated right half
            return search(arr, mid + 1, r, target);
        }

        // ---------------- Right Half Sorted ----------------

        // Target lies inside the sorted right half
        if (target > arr[mid] && target <= arr[r]) {
            return search(arr, mid + 1, r, target);
        }

        // Otherwise search in the rotated left half
        return search(arr, l, mid - 1, target);
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(search(arr, 0, arr.length - 1, target));
    }
}
