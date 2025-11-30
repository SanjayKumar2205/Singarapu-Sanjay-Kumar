//Project Name : Singarapu Sanjay Kumar

import java.util.*;
class Calculator
{
    double a,b;
    String operation;
    public Calculator(double a,double b,String operation)
    {
        this.a=a;
        this.b=b;
        this.operation=operation;
    }
    public double calculate()
    {
        switch(operation.toLowerCase())
        {
            case "add":
                return a+b;
            case "subtract":
                return a-b;
            case "multiply":
                return a*b;
            case "divide":
                if(b==0)
                {
                    System.out.println("Division by zero is not allowed");
                    return 0;
                }
                return a/b;
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a=sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b=sc.nextDouble();
        System.out.print("Enter type of operation (add/ subtract/ multiply/ divide): ");
        String op=sc.next();
        Calculator obj=new Calculator(a,b,op);
        System.out.println("Result: "+obj.calculate());
    }
}
