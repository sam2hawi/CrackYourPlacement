class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
      
        
        Arrays.sort(b);Arrays.sort(a);
      long [] c = new long [n];
        for(int i =0; i < n;i++){
            c[n-1-i]=b[i];
        }

        // Checking condition on each index.
        for (int i = 0; i < n; i++)
            if (a[i] + c[i] < k)
                return false;

        return true;
}
}
