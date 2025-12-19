public class ass63 {
    public static void main(String[] args) {
        String s="MOM AND DAD WILL GOING";
        String word="";

        for(int i=0;i<=s.length();i++){
            if(i<s.length() && s.charAt(i)!=' '){
                word=word+s.charAt(i);
            }
            else{
                if(word.length()>0){
                    String rev="";
                    for(int j=word.length()-1;j>=0;j--){
                        rev=rev+word.charAt(j);
                    }
                    if(word.equals(rev)){
                        System.out.println(word);
                    }
                }
                word="";

            }
        }
    }
}
