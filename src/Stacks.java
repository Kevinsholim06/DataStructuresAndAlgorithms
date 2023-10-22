import javax.swing.*;
import java.util.Stack;

public class Stacks {
    int stack[] = new int[10];
    static int tos;

    public Stacks() {
        tos = -1;
    }

    static boolean isEmpty(){
        if (tos ==-1){
            return true;
        }else {
            return false;
        }
    }

    static boolean isFUll(){
        if (tos ==10){
            return true;
        }else{
            return false;
        }
    }

    void push(int item){
        if (isFUll()){
            System.out.println("Stack is full");
        }else
            stack[++tos]  =item;
    }

    int pop(){
        if (isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }else
            return stack[tos--];
    }

    public static void main(String[] args) {



        Stack stack1 = new Stack();
        Stack stack2 = new Stack();
        for (int i=0; i<11; i++){
            stack1.push(i);
        }
        for (int i=10; i<20; i++){
            stack2.push(i);
        }

        for (int i=0; i<10; i++){
            System.out.println(stack1.pop());
        }
        for (int i=0; i<10; i++){
            System.out.println(stack2.pop());
        }

    }
//    public static int MAXSIZE =8;
//    public static int stack[];
//    public static int top = -1;
//
//
//    public static void main(String[] args) {
//        stack = new int[8];
//        push(3);
//        System.out.println("The element at the top of the stack is "+peek());
//        push(4);
//        push(5);
//        push(6);
//        push(7);
//        push(8);
//
//        while(!isEmpty()){
//            int data = pop();
//            System.out.println(data);
//        }
//        pop();
//    }
//    static boolean isEmpty(){
//        if (top ==-1){
//            return true;
//        }else {
//            return false;
//        }
//    }
//
//    static boolean isFUll(){
//        if (top ==MAXSIZE){
//            return true;
//        }else{
//            return false;
//        }
//    }
//
//    static int peek(){
//        return stack[top];
//    }
//
//    public static int pop(){
//        int data;
//        if (!isEmpty()){
//            data = stack[top];
//            top=top-1;
//            return data;
//        }else{
//            System.out.println("Could not retrieve data, stack is empty!");
//            return 0;
//        }
//
//    }
//
//    public static void push(int data){
//        if(!isFUll()){
//            top =top+1;
//            stack[top]=data;
//        }else{
//            System.out.println("Could not insert data, stack is full!");
//        }
//    }
}
