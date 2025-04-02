class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st = new Stack<>();
        for(char d:num.toCharArray()){
            while(!st.isEmpty() &&k>0 && st.peek()>d){
                st.pop();
                k--;
            }
            st.push(d);
        }
        //remove k digit from end of the st
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }

        StringBuilder s = new StringBuilder();
        while(!st.isEmpty()){
            s.append(st.pop());
        }
        s.reverse();//to get in correct order from stack pop

        while(s.length()>0 && s.charAt(0)=='0'){
            s.deleteCharAt(0);
        }
        //edge case for empty
        return s.length()>0?s.toString():"0";
    }
}
