// class name is always is in PascalCase eg--> SavingAccount, FunctionDemo
public class FunctionDemo {
    // function name must be written in small cases and also use camel case like [getBalance()]
    // void --> no return
    // show --> name of function
    // () --> banana bracket indicates function
    // static --> when class is loaded in memory, static things are loaded first.
    static void show(){  // start of function
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
      // return --> return conditionally from function
    }  // end of function
    public static void main(String[] args) {
        // call a function
        show(); // no need any class object to call with, bcoz we made function static.

    }
}
