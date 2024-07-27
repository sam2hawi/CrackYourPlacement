class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int i =0,j=0;
        while(i<n&&j<n){
            if(arr[j]-arr[i]==x&&i!=j)return 1;
            else if(arr[j]-arr[i]<x)j++;
            else i++;
        }
        return -1;
        
        
    }
}
