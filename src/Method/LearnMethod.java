package Method;

public class LearnMethod {

//To format code in a class: WINDOWS: Ctrl+ALt+L and MAC: Command+Option+L

//Method: is a block of code which has name and return something/value
//Difference between method: Method returns a value but Constructor Doesn't return anything
//Method is a block of code with a name which will execute that block of code if called

//What is block: multiple line of codes

//Method type: 1) Return Type amd 2) Non-Return Type
    //Return type method 2 types: 1)With Parameter and 2)Without Parameter//
    //Non-Return type method 2 types: 1)With Parameter and 2)Without Parameter//

//Method Syntax:
//AccessModifier returnType methodName(){      }
//public void hello() {     }


    //"void Hello (){" INSTANCE or NON-STATIC Method
    public void hello() { //This will not return any value any other place because it's not a main method

        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

    }

    public static void main(String[] args) {

        LearnMethod object = new LearnMethod();
        object.hello(); //INSTANCE VARIABLE //Call method by object name


    }
}





