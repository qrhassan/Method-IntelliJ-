package Method;

public class ReturnTypeMethodWithoutParameter {
    //Return Type Method Without Parameter
    //AccessModifier returnType methodName() {   } <<<<<< DON'T FOLLOW THIS

    //AccessModifier DataType/Class/Object methodName() { return ; } <<<<<<This is a Return Type Method

    //Return type: All type of data, void, class type and object

    //Method naming: verb+noun
    //Method should start with lower case and   camelCaseFormat

    //Non-static method
    //This is a non-return type method
    //REASON: "void" is a keyword which indicates as a non-return type of method
    public void getDisplay() {
        System.out.println("This is a first display");
    }

    //AccessModifier DataType/Class/Object methodName() { return ; } <<<<<<This is a Return Type Method
    //DoSummation 1
    public int doSummation() {
        System.out.println("This is a Do summation method: from Return Type Method");
        //return 0;

        int number1 = 20;
        int number2 = 30;
        //double total = number1+number2;
        //return (int) total;
        int total = number1 + number2;
        System.out.println("Total value is " + total + ": from Return Type Method");
        return total; //<<<< This is a Return keyword //<<<< Return line has to be the last line of the body
    }

    //Another way to display the Total
    //DoSummation 2
    public int doSummation1() {
        System.out.println("This is a Do summation method: from Return Type Method");
        int number1 = 90;
        int number2 = 190;
        int total = number1 + number2;
        System.out.println("Total value is " + total + ": from Return Type Method");
        return number1 + number2; //<<<<< Another way to display the Total
    }

    //DoMultiplication
    public double doMultiplication() {
        double number3 = 12.50;
        double number4 = 10.50;
        double total = number3 * number4;
        System.out.println("Total Value is " + total + ": from Return Type Method");
        return total;
    }

    //GetStudentInformation
    public String GetStudentInformation() {
        String firstName = "Kazi";
        String lastName = "Arham";
        String fullName = firstName + " " + lastName;
        System.out.println("Full name of the student is " + fullName + ": from Return Type Method");
        //String studentName = "Kazi Arham";
        //int studentID = 100;
        //String teacherName = "Kazi Aizah";
        //int teacherID = 200;
        //System.out.println("Student name is " + studentName + " Student ID is " + studentID + ".\n" + "Teacher name is " + teacherName + "Teacher ID is " + teacherID + ".");
        //return studentName;

        return fullName;
    }

    public boolean isHeThere() {
        boolean isHeThere = true;
        System.out.println("I think he is there: " + isHeThere);
        return isHeThere;
    }


    //Static method
    public static void main(String[] args) {

        //non-static method call by object name
        ReturnTypeMethodWithoutParameter object = new ReturnTypeMethodWithoutParameter();
        object.getDisplay();
        object.doSummation();
        object.doSummation1();
        object.doMultiplication();
        object.GetStudentInformation();
        object.isHeThere();

    }
}
