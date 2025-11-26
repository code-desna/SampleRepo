import java.util.Scanner;

public interface CalcMethods {
    int  add(int a,int b);
    int sub(int a,int b);
    int mul(int a,int b);
    int div(int a,int b);
}
class Calc implements CalcMethods {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }
}
    class Calculator {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int a;
            int b;
            char operator;
            Calc obj=new Calc();
            System.out.println("Enter first num");
            a=sc.nextInt();
            System.out.println("Enter second num");
            b=sc.nextInt();
            System.out.println("Enter operator(+,-,/,*)");
            operator=sc.next().charAt(0);
            if(operator=='+'){
                System.out.println( obj.add(a,b));
            }else if(operator=='-'){
                System.out.println( obj.sub(a,b));
            }else if(operator=='*'){
                System.out.println( obj.mul(a,b));
            }else if(operator=='/'){
               System.out.println(obj.div(a,b));
            }else {
                System.out.println("Not valid oops");
            }
        }
    }

