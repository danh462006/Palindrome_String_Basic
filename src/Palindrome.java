public class Palindrome {
    public static String palin(String palindrome){
        String nguoi = new StringBuilder(palindrome).reverse().toString();
        if(palindrome.equals(nguoi.toString())){
            return "chuoi ban vua nhap la: Palindrome";
        }
        return  "chuoi ban vua nhap khong phai la: Palindrome";
    }
}
