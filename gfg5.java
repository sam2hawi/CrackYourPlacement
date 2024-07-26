 static int ceilSearch(int arr[], int low, int high, int x)
    {
      int i;    
      
      /* If x is smaller than or equal to first 
         element,then return the first element */
      if(x <= arr[low])
        return low;  
      
      /* Otherwise, linearly search for ceil value */
      for(i = low; i < high; i++)
      {
        if(arr[i] == x)
          return i;
      
        /* if x lies between arr[i] and arr[i+1] 
        including arr[i+1], then return arr[i+1] */
        if(arr[i] < x && arr[i+1] >= x)
           return i+1;
      }         
      
      /* If we reach here then x is greater than the 
      last element of the array,  return -1 in this case */
      return -1;
    }
