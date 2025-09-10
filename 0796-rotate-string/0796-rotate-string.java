class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length() != s.length()){
            return false;
        }
        if(s.length() == 0){
            return true;
        } 
        String str = s+s;
        return str.contains(goal);       
    }
}