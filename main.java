public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to SonarQube Analysis!");

        // Error 1: Incorrect method call - missing parameter
        int result = addNumbers(5);  // 'addNumbers' expects 2 arguments
        System.out.println("Sum: " + result);

        // Error 2: Unused variable (dead code)
        String unusedVar = "This variable is not used";

        // Error 3: Null pointer dereference - potentially null value passed to method
        String name = null;
        System.out.println(greetUser(name));  // The 'name' is null, this should cause an error

        // Error 4: Wrong method name, method does not exist
        int diff = subtractNum(10, 5);  // Method 'subtractNum' does not exist, it should be 'subtractNumbers'
        System.out.println("Difference: " + diff);
    }

    // Error 5: Method with the wrong number of parameters
    public static int addNumbers(int a) {  // Should take two parameters
        return a + 10;
    }

    // Error 6: Method with incorrect return type, should return boolean
    public static String subtractNumbers(int a, int b) {  // It should return an int, not a String
        return "Result: " + (a - b);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String greetUser(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello, guest!";
        }
        return "Hello, " + name + "!";
    }
}
