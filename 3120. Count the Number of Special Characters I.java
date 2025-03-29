class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> small = new HashSet<>();
        Set<Character> cap = new HashSet<>();
        
        for(char c:word.toCharArray()){
            if(c>='a' && c<='z'){
                small.add(c);
            }
            else{
                cap.add(c);
            }
        }
        int count=0;
        for(char c:small){
            if(cap.contains(Character.toUpperCase(c))){
                count++;
            }
        }
        return count;

    }
}
