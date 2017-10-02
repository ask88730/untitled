package convertMitoKM;

public class convertMitoKM{
    public static void main(String[] args){
        java.util.Scanner sc =new java .util.Scanner(System.in);
        System.out.println("輸入數字吧");
        System.out.println("輸入數字二");
        System.out.println("輸入數字");
        double  n1=sc.nextDouble();
        double  n2=sc.nextDouble();
        double  n3=sc.nextDouble();

        double sum=n1+n2+n3;
        double average=sum/3;

        System.out.println(sum +" "+average);


    }
}