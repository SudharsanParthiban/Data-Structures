import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        int option;
        do{
            System.out.println("(::::::::::::::::::::-STACK-::::::::::::::::::::)");
            System.out.println("-------------------------------------------------");
            System.out.println("-------------------Operations--------------------");
            System.out.println("-0.Exit                                         -");
            System.out.println("-1.Push                                         -");
            System.out.println("-2.Pop                                          -");
            System.out.println("-3.Peek                                         -");
            System.out.println("-4.Length                                       -");
            System.out.println("-5.ChangeValue                                  -");
            System.out.println("-6.CheckFull                                    -");
            System.out.println("-7.CheckEmpty                                   -");
            System.out.println("-8.Display                                      -");
            System.out.println("-------------------------------------------------");
            System.out.println("(::::::::::::::::::::-------::::::::::::::::::::)");
            System.out.print("Enter the option:");
            option = sc.nextInt();
            int data,pos;
            switch(option){
                case 1:
                    System.out.println("Push Operation");
                    System.out.println("-------------------------------------------------");
                    System.out.print("Enter the value to push:");
                    data = sc.nextInt();
                    System.out.println("-------------------------------------------------");
                    s.push(data);
                    System.out.println("-------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Pop Operation");
                    System.out.println("-------------------------------------------------");
                    System.out.println("The popped element : "+s.pop());
                    System.out.println("-------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Peek Operation");
                    System.out.println("-------------------------------------------------");
                    System.out.print("Enter the position of the element:");
                    pos = sc.nextInt();
                    System.out.println("-------------------------------------------------");
                    System.out.println("The element of given position : "+s.peek(pos));
                    System.out.println("-------------------------------------------------");
                    break;
                case 4:
                    System.out.println("-------------------------------------------------");
                    System.out.println("The number of elements in stack : "+s.count());
                    System.out.println("-------------------------------------------------");
                    break;
                case 5:
                    System.out.println("-------------------------------------------------");
                    System.out.print("Enter the position to change:");
                    pos = sc.nextInt();
                    System.out.print("Enter the value to change:");
                    data = sc.nextInt();
                    System.out.println("-------------------------------------------------");
                    s.changeValue(data,pos);
                    System.out.println("-------------------------------------------------");
                    break;
                case 6:
                    System.out.println("-------------------------------------------------");
                    if(s.isFull())
                        System.out.println("The stack is full!!!");
                    else
                        System.out.println("The stack is not full!!!");
                    System.out.println("-------------------------------------------------");
                    break;
                case 7:
                    System.out.println("-------------------------------------------------");
                    if(s.isEmpty())
                        System.out.println("The stack is empty!!!");
                    else
                        System.out.println("The stack is not empty!!!");
                    System.out.println("-------------------------------------------------");
                    break;
                case 8:
                    System.out.println("-------------------------------------------------");
                    System.out.println("The elements in the stack:");
                    s.display();
                    System.out.println("-------------------------------------------------");
                    break;
                default:
                    System.out.println("Enter a valid option!!!");
                    break;
            }
        }while(option != 0);

    }
}
