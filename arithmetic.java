import java.util.Scanner;
class arithmetic {
    public static void main(String[] args) {
        Scanner asw = new Scanner(System.in);
        
        System.out.print("Enter a first number: ");
        int N1 = asw.nextInt();
        System.out.print("Enter a second Number: ");
        int N2= asw.nextInt();
    

        System.out.println("The sum is:"+  (N1+N2));
        System.out.println("The Sub is: "+ (N1-N2));
        System.out.println("The Mul is:"+  (N1*N2));
        System.out.println("The div is:"+  (N1/N2));
    }
}