public class ReflectionDemo {
    
    private int x;
    private String str;

    private ReflectionDemo(){
        this.x = 0;
        this.str = "Hi.. !";
    }
    private void privateReflectionMethod(){
        System.out.println("inside reflection private method");
    }
}
