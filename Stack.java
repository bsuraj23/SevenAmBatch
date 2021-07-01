import java.util.Scanner;
public class Stack {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Stack1 object = new Stack1();
        while (true) {
            System.out.println("1.push \n2.pop \n3.peek \n4.traverse 5.exit");
            System.out.println("enter your choice: ");
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    object.push();
                    break;
                case 2:
                    object.pop();
                    break;
                case 3:
                    object.peek();
                    break;
                case 4:
                    object.traverse();
                    break;
                case 5:
                    System.exit(1);
                default:
                    System.out.println("input is invalid!!!");
            }
        }
    }
}
class Stack1 extends Stack {
    int top = -1;
    int data;
    int size;

    Stack1() {
        System.out.println("enter the size of array:");
        size = scanner.nextInt();
        System.out.println("the array of size " + size + " is created.");
    }

    int stack[] = new int[5];

    void push() {
        if (top ==size-1)
            System.out.println("Stack is full!!!");
        else {
            System.out.println("enter the number to be pushed: ");
            data = scanner.nextInt();
            top++;
            stack[top] = data;
        }
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack is empty!!!");
        else {
            System.out.println("the element " + stack[top] + " is poped");
            stack[top] = 0;
            top--;
        }
    }

    void peek() {
        System.out.println("the last added element is: " + stack[top]);
    }

    void traverse() {
        for (int i : stack) {
            System.out.print(" "+i );

        }
        System.out.println(" ");
    }
}