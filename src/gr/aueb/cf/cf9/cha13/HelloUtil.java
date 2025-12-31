package gr.aueb.cf.cf9.cha13;

/**
 * Utility classes are non-instantiable.
 * They provide public static methods only.
 */
public class HelloUtil {

    /**
     * No instances of this class should be available
     */
    private HelloUtil(){}

    public static void sayHello(){
        System.out.println("Hello world!!!");
    }
}
