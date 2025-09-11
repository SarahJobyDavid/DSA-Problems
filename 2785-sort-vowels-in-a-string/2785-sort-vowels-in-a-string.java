class Solution {
    public String sortVowels(String s) {
        String vowels = "aeiouAEIOU";
        ArrayList<Character> vowelList = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(vowels.indexOf(ch) != -1){
                vowelList.add(ch);
            }
        }
        Collections.sort(vowelList);
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(vowels.indexOf(ch) != -1){
                sb.append(vowelList.get(index++));
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}