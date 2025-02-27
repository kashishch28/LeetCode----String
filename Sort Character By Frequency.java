class Solution {
    public String frequencySort(String s) {
        int[] res = new int[128];
        for(char c: s.toCharArray()){
            res[c]++;
        }
        List<Character>lst = new ArrayList<>();
        for(char i=0;i<128;i++){
            if(res[i]>0){
                for(int j=0;j<res[i];j++){
                    lst.add(i);
                }
            }
        }
        lst.sort((a,b)-> res[b]-res[a]);
        StringBuilder str = new StringBuilder();
        for(char c:lst){
            str.append(c);
        }
        return str.toString();
    }
}
