class Solution {
    public int maximum69Number (int num) {
        int result = 0;
        String charArray = String.valueOf(num);
        boolean check = true;
        for(int i = 0; i < charArray.length(); i++){
            char ch = charArray.charAt(i);
            if('6' == ch && check){
                result = (result*10) + 9;
                check = false;
            }else{
                result = (result*10) + Integer.parseInt(String.valueOf(ch));
            }
        }
        return result;
    }
}