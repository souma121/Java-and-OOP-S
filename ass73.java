public class ass73 {
    public static void main(String[] args) {
        String s="MADAM";
        String rev="";

        for(int i=s.length()-1;i>=0;i++){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("pallindrome");
        }
        else if(s.charAt(0) == s.charAt(s.length()-1)){
            System.out.println("Special word");
        }
        else{
            System.out.println("NOA");
        }

    }
}
