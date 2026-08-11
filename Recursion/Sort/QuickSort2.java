//Quick sort using mid as pivot
static void qs(int arr[], int low, int high) {

    if (low >= high) {
        return;
    }

    int s = low;
    int e = high;

    int mid = s + (e - s) / 2;
    int pivot = arr[mid];

    while (s <= e) {

        while (s <= e && arr[s] < pivot) {
            s++;
        }

        while (s <= e && arr[e] > pivot) {
            e--;
        }

        if (s <= e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }

    qs(arr, low, e);
    qs(arr, s, high);
}
