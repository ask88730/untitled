package convertMitoKM;

public class convertMitoKM {
    public static void main(String[]args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("輸入攝氏拉");
        double mi=sc.nextDouble();

        double Km =mi*0.8+32;
        System.out.println("攝氏:" + mi);
        System.out.println("華氏:" + Km);
    }
}
