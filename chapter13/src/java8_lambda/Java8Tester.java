package java8_lambda;

/**
 * @Author: zhangshibin
 * @Date: 2021/10/22 - 10 - 22 - 18:43
 * @Description: java8_lambda
 * @version: 1.0
 */
public class Java8Tester {
    public static void main(String[] args) {
    /*
    * 10 + 5 = 15
      10 - 5 = 5
      10 x 5 = 50
      10 / 5 = 2
      Hello Runoob
      Hello Google
    * */
        Java8Tester Tester = new Java8Tester();
        MathOperation addition = (int a,int b) -> a + b;
        MathOperation subtraction = (int a,int b) -> a - b;
        MathOperation multiplication = (int a,int b) -> a * b;
        MathOperation division = (int a,int b) -> a / b;

        GreetingService greeting = message -> System.out.println("message " + message);
        GreetingService greeting2 = message -> System.out.println("message " + message);

        System.out.println("a + b = " + Tester.operator(5,6,addition));
        System.out.println("a + b = " + Tester.operator(5,6,subtraction));
        System.out.println("a + b = " + Tester.operator(5,6,multiplication));
        System.out.println("a + b = " + Tester.operator(5,6,division));

        greeting.sayMessage("Hello");
        greeting2.sayMessage("HHHH");
    }
    interface MathOperation {
        int operation(int a,int b);
    }
    interface GreetingService{
        void sayMessage(String message);
    }


    private int operator(int a,int b,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}