class Solution {
    public String longestCommonPrefix(String[] strs) {
     Arrays.sort(strs);
     String a = strs[0];
     String b = strs[strs.length-1];
     int index =0;
while(index<a.length()&& index<b.length()){
     if(a.charAt(index)==b.charAt(index))index++;
     else{
        break;
     }
}
return a.substring(0,index);
    }
}
