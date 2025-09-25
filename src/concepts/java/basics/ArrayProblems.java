import java.util.Arrays;

public class ArrayProblems {
    // Reverse in-place
    public static void reverse(int[] a) {
        int i = 0, j = a.length - 1;
        while (i < j) {
            int t = a[i]; a[i] = a[j]; a[j] = t;
            i++; j--;
        }
    }

    // Rotate right by k (cyclic)
    public static void rotateRight(int[] a, int k) {
        int n = a.length;
        k = ((k % n) + n) % n;
        reverseRange(a, 0, n-1);
        reverseRange(a, 0, k-1);
        reverseRange(a, k, n-1);
    }
    private static void reverseRange(int[] a, int l, int r) {
        while (l < r) { int t=a[l]; a[l]=a[r]; a[r]=t; l++; r--; }
    }

    // Merge two sorted arrays into a new sorted array
    public static int[] mergeSorted(int[] a, int[] b) {
        int[] out = new int[a.length + b.length];
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length) out[k++] = (a[i]<=b[j]) ? a[i++] : b[j++];
        while (i<a.length) out[k++] = a[i++];
        while (j<b.length) out[k++] = b[j++];
        return out;
    }

    // Binary search (iterative), returns index or -1
    public static int binarySearch(int[] a, int target) {
        int l=0,r=a.length-1;
        while (l<=r) {
            int m = l + (r-l)/2;
            if (a[m]==target) return m;
            if (a[m]<target) l=m+1; else r=m-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        reverse(a);
        System.out.println("Reversed: " + Arrays.toString(a));
        rotateRight(a, 2);
        System.out.println("RotateRight(2): " + Arrays.toString(a));
        int[] m = mergeSorted(new int[]{1,3,5}, new int[]{2,4,6});
        System.out.println("Merged: " + Arrays.toString(m));
        System.out.println("BinarySearch 4 -> " + binarySearch(m,4));
    }
}
