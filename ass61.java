import java.util.Scanner;
public class ass61 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string in Upppercase");
        String str=sc.nextLine();

        String s="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                s=s+'*';
            }
            else{
                s=s+ch;
            }
        }
        System.out.println("Output " + s);
    }
}
