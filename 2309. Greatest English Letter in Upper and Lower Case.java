class Solution {
    public String greatestLetter(String s) {
        char a = 'z';
        char b = 'Z';
        //check if both upper and lower case of char exist if not it returns -1 and decrease the character
        for(int i=0;i<26;i++){
            if(s.indexOf(a)!=-1 && s.indexOf(b)!=-1){
                return ""+b;
            }
            else{
                a--;
                b--;
            }
        }
        return "";
        
        
    }
}
