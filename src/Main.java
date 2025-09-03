import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" vui long nhap chuoi ban muon: ");
        String pt = sc.nextLine();
        Palindrome Palin = new Palindrome();
        System.out.println( Palin.palin(pt));
    }
}