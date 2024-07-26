class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> ans = new Stack();
        for(int i =0; i<S.length();i++){
            char c = S.charAt(i);
            if(Character.isDigit(c))
            ans.push(c-'0');
            else{
                int op1=ans.pop();
                int op2 = ans.pop();
                int result=0;
                switch(c){
                    case '+':
                        result = op1+op2;
                        break;
                    case '-':
                        result=op2-op1;
                        break;
                    case '*':
                        result=op1*op2;
                        break;
                    case '/':
                        result=op2/op1;
                        break;
                }
                ans.push(result);
                
            }
        }
        return ans.pop();
        
    }
}
