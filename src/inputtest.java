import java.util.jar.JarEntry;

public class inputtest {
    public static void main(String[]args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("what you're name?");
        String name = sc.next();
        System.out.println(name);
        System.out.println("how old are you ?");
        int age = sc.nextInt();
        System.out.println(name + " you're" + age +" years old.");


    }
}
