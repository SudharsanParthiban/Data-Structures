public class Stack {
    private int top;
    private int[] arr;

    public Stack(){
        top = -1;
        arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = 0;
        }
    }
    public boolean isFull(){
        return top == 4;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public void changeValue(int data,int pos){
        if(arr[pos]!=0) {
            arr[pos] = data;
            System.out.println("Value changed successfully!!!");
        }
        else{
            System.out.println("The position is empty so it can't be modified");
        }
    }
    public void push(int data){
        if(isFull()){
            System.out.println("The Stack is overflow!!!");
        }
        else{
            top++;
            arr[top] = data;
            System.out.println("Elements pushed successfully!!!");
        }
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("The Stack is underflow!!!");
            return 0;
        }
        else{
            int pos;
            pos = arr[top];
            arr[top] = 0;
            top--;
            return pos;
        }
    }
    public int peek(int pos){
        return arr[pos];
    }
    public int count(){
        return top+1;
    }
    public void display(){
        for(int i=4;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
