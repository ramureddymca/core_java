import java.util.Stack;

class Solution {
    /*  public boolean isValid(String s) {

        Stack<Character> stack=new Stack();
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch=='(' || ch =='{' || ch=='[')
               stack.push(ch);
           else if(ch==')' && !stack.isEmpty() &&stack.peek()=='(')
               stack.pop();
           else if(ch=='}' && !stack.isEmpty() && stack.peek()=='{')
               stack.pop();
           else if(ch==']' && !stack.isEmpty() && stack.peek()=='[')
               stack.pop();
           else
               return false;
       }
       return stack.isEmpty();
   }*/
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.add(s.charAt(0));
        for(int i =1; i< s.length(); i++){
            
          if(s.charAt(i) ==']'){
              char ch = 'x';
              if(!stack.isEmpty()){
                  ch = stack.pop();
              }
                 if(ch == '['){
                     continue;
                 }
                 return false;
          }else  if(s.charAt(i) =='}'){
              char ch = 'x';
              if(!stack.isEmpty()){
                  ch = stack.pop();
              }
                 if(ch == '{'){
                     continue;
                 }
                 return false;
          }else if(s.charAt(i) ==')'){
              char ch = 'x';
              if(!stack.isEmpty()){
                  ch = stack.pop();
              }
                 if(ch == '('){
                     continue;
                 }
                 return false;
          } else {
              stack.add(s.charAt(i));
          }
        }
           
                 if(stack.isEmpty()) {
                     return true;}
                 else { 
                     return false;
                 }
        
    
    }
    


}