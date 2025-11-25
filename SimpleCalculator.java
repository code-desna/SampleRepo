import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOne;
        int numTwo;
        int input;
        char state;


        do {
            System.out.println("-----Menu-------\n1.Addition\n2.Substraction\n3.Division\n4.Multiplication\nEnter your choice");
            input = sc.nextInt();
            System.out.println("Enter first number");
            numOne = sc.nextInt();
            System.out.println("Enter second number");
            numTwo = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println(numOne + numTwo);
                    break;
                case 2:
                    System.out.println(numOne - numTwo);
                    break;

                case 3:
                    System.out.println(numOne / numTwo);
                    break;

                case 4:
                    System.out.println(numOne * numTwo);
                    break;

                default:
                    System.out.println("Enter valid operator");
            }
            System.out.println("Do you want to continue?press y/n");
                state = sc.next().charAt(0);


        }while (state=='y'|| state=='Y');
    }

}
