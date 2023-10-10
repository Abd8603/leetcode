class Solution {
    public int compress(char[] chars) {
        int i = 0, pos = 0;
        while(i < chars.length){
            int count = 1;
            while((i+count < chars.length) && (chars[i + count] == chars[i])){
                count++;
            }
            chars[pos++] = chars[i];
            if(count > 1){
                for(char c : Integer.toString(count).toCharArray()){
                    chars[pos++] = c;
                }
            }
            i += count;
        }
        return pos;        
    }
}