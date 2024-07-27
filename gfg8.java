lass Solution {
    // Function to find minimum number of pages.
    public static long findPages(int n, int[] arr, int m) {
        // Your code here
        if(n <m)return -1;
        int low = arr[0];
        int high =0;
        for(int i =0; i<n ; i++){
            if(arr[i]>low)low = arr[i];
            high+=arr[i];
        }
        while(low<=high){
           int mid = low+(high-low)/2;
            int student = count(arr,mid);
            if(student>m)low=mid+1;
            else high = mid-1;
        }
        return low;
        
    }
    public static int count(int[]arr, int pages){
        int student =1;
        long pagesstu = 0;
        for(int i =0; i<arr.length;i++){
            if(pagesstu+arr[i]<=pages)pagesstu+=arr[i];
            else{
                student++;
                pagesstu = arr[i];
            }
        }
        return student;
        
    }
}
