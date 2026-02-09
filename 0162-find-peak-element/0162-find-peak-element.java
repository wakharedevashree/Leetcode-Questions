class Solution {
    public int findPeakElement(int[] a) {
        int l = 0, h = a.length - 1;

        while (l < h) {
            int mid = l + (h - l) / 2;

            if (a[mid] < a[mid + 1]) {
                l = mid + 1;
            } else {
                h = mid;
            }
        }
        return l; // or h (both same)
    }
}
