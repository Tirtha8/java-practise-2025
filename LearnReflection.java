import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LearnReflection {
    
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // System.out.println("I am learning Reflection API");

        Class<?> class1 = Class.forName("ReflectionDemo1");

        // to print class name
        System.out.println("Class Name: " + class1.getName());
        
        // to print all constructors
        for (var cons : class1.getDeclaredConstructors()) {
            System.out.println("Constructor: " + cons);
        }

        // to print all fields
        for(var field : class1.getDeclaredFields()){
            System.out.println("Field: " + field.getName());
        }

        // to initialise an object
        Constructor cons = class1.getDeclaredConstructor(int.class, String.class);
        cons.setAccessible(true);
        Object obj1 = cons.newInstance(100, "TechXEasy");
        // System.out.println( );

        // to access a private method
        var method = class1.getDeclaredMethod("privateReflectionMethod") ;
        method.setAccessible(true);
        method.invoke(obj1);



    }
}

class ReflectionDemo1 {
    
    private int x;
    private String str;

    public int getX() {
        return x;
    }
    public String getStr() {
        return str;
    }
    private ReflectionDemo1(int x, String str){
        // this.x = 0;
        // this.str = "Hi.. !";
        this.x = x;
        this.str = str;
    }
    private void privateReflectionMethod(){
        System.out.println("inside reflection private method");
    }
}
