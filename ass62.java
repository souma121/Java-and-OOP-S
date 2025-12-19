public class ass62 {
    public static void main(String[] args) {
        String str="MY NAME IS FOOTBALL";
        String longest="";
        String word="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                word=word+ch;
            }
            else{
                if(word.length()>longest.length()){
                    longest=word;
                }
                word="";
            }
        }
        if(word.length()>longest.length()){
            longest=word;
        }
        System.out.println(longest);
        System.out.println(longest.length());
    }
}
