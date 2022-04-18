package Method;

public class NonReturnTypeMethod {
    //Non-Return Type method: void type
    //Non-Return Type method without parameter


    //AccessModifier returnType methodName() {}
    //Return type is void always
    //No Return as well
    public void tvDisplay() {
        System.out.println("I like to eat");

    }

    public void doSum() {
        int a = 100;
        int b = 200;

        System.out.println("total is " + (a + b));

        //What is the difference between NON-RETURN and RETURN type method:
        //NON-RETURN: it does not hold any value, rather it just executes regular result; such as void type
        //RETURN: it holds a value and can do mathematical calculations
    }
    //Example of Return type method
//    public int doSummation (){
//        int num1 = 78;
//        int num2 = 82;
//        int total = num1 + num2;
//        System.out.println("total is " + total);
//        return total;

//    }

    public void doSum2 (int c, int d, int e){
        System.out.println("total is " + (c+d+e));
    }

    public static void main(String[] args) {
        NonReturnTypeMethod nonReturnTypeMethod = new NonReturnTypeMethod();
        NonReturnTypeMethod nonReturnTypeMethod1 = new NonReturnTypeMethod();
        nonReturnTypeMethod.tvDisplay();
        nonReturnTypeMethod.doSum();
        nonReturnTypeMethod.doSum2(100,300,500);

    }
}
