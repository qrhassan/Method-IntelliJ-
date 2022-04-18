package Method;

public class ReturnTypeMethodWithParameter {

    //Return Type Method With Parameter

    //AccessModifier DataType/Class/Object methodName( parameter  ) { return ; } <<<<<<This is a Return Type Method

    //Return type: All type of data, void, class type and object

    //Dynamic Return Parameterized Method

    //This is a one time creation method, which can be used rest of the life

    //getStudentInfo Method
    public String getStudentInfo(String name) {
        // String name = "Aizah";
        System.out.println("Student Name is " + name);

        return name;
    }

    //getStudentInfo1 Method
    public String getStudentInfo1(String grade, String sub, int score) {
        System.out.println("Grade is " + grade + " - " + " Sub is " + sub + " - " + " Score is " + score);

        return grade;
    }

    //doSummation Method
    public double doSummation(double salary, double bonus) {
        double netSalary = salary + bonus;
        System.out.println("Net Salary for Arham is " + netSalary);

        return netSalary;
    }

    //doMultiplication Method
    public double doMultiplication(int tankSize, double gasPrice) {
        double gasCost = tankSize * gasPrice;
        double gasCostRoundOff = Math.round(gasCost * 100.0) / 100.0;
        System.out.println("Total gas cost per refuel is $" + gasCostRoundOff);
        return gasCostRoundOff;
    }

    public boolean isPizzaAvailable(String pizzaName, char size, int price) {
        char pizzaSize = size;
        double pizzaPrice = price;
    //If Large Pizza is available then say yes otherwise no

        if (pizzaSize == 'L') {
            System.out.println("Yes, L size pizza is available");
        } else{
            System.out.println("No, L size pizza is not available");
        }

        return pizzaSize == 'L';
    }

    public static void main(String[] args) {
        ReturnTypeMethodWithParameter object = new ReturnTypeMethodWithParameter();
        object.getStudentInfo("Sultana"); //Argument passing inside method
        object.getStudentInfo("Kazi"); //Argument passing inside method
        object.getStudentInfo("Chowdhury"); //Argument passing inside method
        object.getStudentInfo("Fouzia"); //Argument passing inside method
        object.getStudentInfo1("A", "Math", 94);
        object.getStudentInfo1("B", "English", 85);
        object.getStudentInfo1("C", "Geography", 70);
        object.doSummation(7000.50, 1500.50);
        object.doMultiplication(15, 4.19);
        object.isPizzaAvailable("Alfredo", 'L', 15);


    }

}
