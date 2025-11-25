import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int numOne;
            int numTwo;
            char input;
            System.out.println("Enter first number");
            numOne=sc.nextInt();
        System.out.println("Enter second number");
        numTwo=sc.nextInt();
        System.out.println("Enter operator");
        input=sc.next().charAt(0);
        switch(input){
            case '+':
                System.out.println(numOne+numTwo);
                break;
            case '-':
                System.out.println(numOne-numTwo);
                break;

                case '/':
                System.out.println(numOne/numTwo);
                break;

            case '*':
                System.out.println(numOne*numTwo);
                break;

            default:
                System.out.println("Enter valid operator");
        }
    }


}
