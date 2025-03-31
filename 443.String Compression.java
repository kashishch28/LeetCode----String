class Solution {
    public int compress(char[] chars) {
        int ind = 0;
        int n = chars.length;
        for(int i=0;i<n;i++){
            char ch = chars[i];
            int count=0;
            while(i<n && chars[i]==ch){
                count++;
                i++;
            }
            if(count==1){
                chars[ind++] = ch;
            }
            else{
                chars[ind++] = ch;
                for(char c:Integer.toString(count).toCharArray()){
                    chars[ind++] = c;
                }
            }
            i--;
        }
        return ind;
    }
}
