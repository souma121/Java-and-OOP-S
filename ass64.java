public class ass64 {
    public static void main(String[] args) {
        String s="COMPUTER IS FUN";
        String word="";
        String result="";
        for(int i=0;i<=s.length();i++){
            if(i<s.length() && s.charAt(i)!=' '){
                word=word+s.charAt(i);
            }
            else{
                if(!word.equals("")){
                    result=word+" "+result;
                }
                word="";
            }


        }
        System.out.println(result);
    }
}
