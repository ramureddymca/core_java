import java.util.Map;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack1 s = new Stack1();
        s.push(91);
        s.push(2);
        s.push(7);
        s.push(17);
        s.push(72);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.size());

    }
}

class Stack1{

    public Stack1(){
        arr = new int[capacity];
    }
    private int arr[] ;
    private int top;
    static final int capacity =1000;

    public Stack1(int size){
    arr = new int[capacity];
    top =-1;

    }

    public int push(int value){

        if(isFull()){
            System.out.println("Stack Overflow");
            return -1;
        }else{
            arr[++top] = value;
            return value;
        }
    }

    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }else{
            return arr[top--];
        }

    }

    private boolean isEmpty() {
        return top ==-1;
    }

    private boolean isFull() {
        return capacity ==top;
    }

    public int size() {
        return top;
    }
}
