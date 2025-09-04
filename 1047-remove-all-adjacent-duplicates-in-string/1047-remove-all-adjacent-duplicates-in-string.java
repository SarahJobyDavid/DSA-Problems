class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!stk.isEmpty() && stk.peek() == s.charAt(i)){
                stk.pop();
            }
            else{
                stk.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<stk.size(); i++){
            sb.append(stk.get(i));
        }
        return sb.toString();
    }
}