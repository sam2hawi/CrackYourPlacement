class Solution {
    public int maxArea(int[] height) {
        int s = 0;
        int e= height.length-1;
        int max = 0;
        while(s<e){
            int sh = height[s];
            int eh = height[e];
            int min = Math.min(sh,eh);
            max = Math.max(max, min*(e-s));
            if(sh<eh)
                s++;
            else
            e--;
        }
        return max;
    }
}
