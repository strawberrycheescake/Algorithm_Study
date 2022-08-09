import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] res = new int[commands.length];
        int i = 0;
        for (int[] command : commands) {
            int[] part = Arrays.copyOfRange(array,command[0]-1,command[1]);
            res[i++] = select(part,command[2]-1);
        }
        return res;
    }
    
    public int select (int[] a, int k) {
        int lo = 0, hi = a.length - 1;
        while (hi > lo) {
            int j = partition(a,lo,hi);
            if (j==k) return a[k];
            else if (j > k) hi = j - 1;
            else lo = j + 1;
        }
        return a[k];
    }
    
    public int partition(int[] a, int lo, int hi) {
        int i = lo, j = hi+1;
        int v = a[lo];
        while (true) {
            while (a[++i] < v) if (i == hi) break;
            while (v < a[--j]);
            if (i >= j) break;
            int save = a[i];
            a[i] = a[j];
            a[j] = save; 
        }
        int save = a[lo];
        a[lo] = a[j];
        a[j] = save;
        return j;
    }
}

