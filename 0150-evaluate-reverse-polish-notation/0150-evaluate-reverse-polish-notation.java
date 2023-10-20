class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        String check = "+-*/";
        String s;
        int answer = 0;
        int x,y;
        if(tokens.length == 1){
            return Integer.parseInt(tokens[0]);
        }
        for(int i = 0; i < tokens.length;i++){
            s = tokens[i];
            if(check.contains(s)){
                switch(s){
                    case("+"):
                        x = st.pop();
                        y = st.pop();
                        answer = y + x;
                        st.push(answer);
                        break;
                    case("-"):
                        x = st.pop();
                        y = st.pop();
                        answer = y - x;
                        st.push(answer);
                        break;
                    case("*"):
                        x = st.pop();
                        y = st.pop();
                        answer = y * x;
                        st.push(answer);
                        break;
                    case("/"):
                        x = st.pop();
                        y = st.pop();
                        answer = y / x;
                        st.push(answer);
                        break;
                    default:
                        break;
                }
            }
            else{
                st.push(Integer.parseInt(s));
            }

        }
        return answer;
    }
}