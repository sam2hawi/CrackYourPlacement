class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length()>=needle.length()&& haystack.contains(needle)){
            
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
