class Solution {
    public boolean isPalindrome(int x) {
        String ans=Integer.toString(x);
        return anss(ans);
    }
     public boolean anss(String name){
        if(name==null||name.length()==0){
            return true;
        }
        int start =0;
        int end=name.length()-1;
        while(start<=end){
            if(name.charAt(start)==name.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}