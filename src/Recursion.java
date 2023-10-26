public class Recursion {

    public static void main(String[] args) {
        int value = 6;
        int returnValue= recursiveFunction(value);
        System.out.println("Main:" +returnValue);

    }

    static int recursiveFunction (int value){
        System.out.println("Recursive function " +value);
        if (value<=5){
            return -9;
        }else {
           return recursiveFunction(value-1);
        }

    }

}
