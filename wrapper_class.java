public class wrapper_class {
    public static void main(String[] args) {
        //Primitive to Wrapper class.. [Autoboxing]

        // int a=20;
        // Integer i=Integer.valueOf(a);//explicitly converted
        // Integer j=a;

        //Wrapper to Primitive....[Unboxing]

        Integer a=3;
        int i=a.intValue();
        int j=a;

        System.out.println("The value of a : " + a.getClass().getName());
        System.out.println("The value of a after exiplicitly convert: " + ((Object)i).getClass().getName());
        System.out.println("The value of a after exiplicitly convert: " + ((Object)j).getClass().getName());
    }
}
