class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int mid = len/2;
        len--;
        int index = 0;
        char temp;
        int x;
        while(index < mid){
            x = len - index;
            temp = s[x];
            s[x] = s[index];
            s[index] = temp;
            index++;
        }
    }
}