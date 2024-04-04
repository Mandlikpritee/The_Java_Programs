public class MergeArrays {
    public static void mergeArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;
        int d = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (A[i] != 0) {
                A[d] = A[i];
              d--;
            }
        }
        int i = n;
        int j = 0;
        d= 0;
        while (i < m && j < n) {
            if (A[i] <= B[j]) {
                A[d] = A[i];
                i++;
            } else {
                A[d] = B[j];
                j++;
            }
            d++;
        }
        
        while (j < n) {
            A[d] = B[j];
            j++;
            d++;
        }
    }

    public static void main(String[] args) {
        int[] A = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] B = {1, 8, 9, 10, 15};
        
        mergeArrays(A, B);
        
        
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}