public class ass65 {
    public static void main(String[] args) {
        String s="IT IS IMPORTANT EDUCATION";
        int maxVowel=0;
        String word="";
        String maxWord="";

        for(int i=0;i<=s.length();i++){
            if(i<s.length() && s.charAt(i)!=' '){
                word=word+s.charAt(i);
            }
            else{
                if(!word.equals("")){
                    int count=0;
                    for(int j=0;j<word.length();j++){
                        char ch=word.charAt(j);
                        if(ch=='A'|| ch=='E'|| ch=='I'|| ch=='U'|| ch=='O'|| ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
                            count++;
                        }

                    }
                    if(count>maxVowel){
                        maxVowel=count;
                        maxWord=word;
                    }
                }
                word="";
            }
        }
        System.out.println(maxWord);
        System.out.println(maxVowel);
    }
}
