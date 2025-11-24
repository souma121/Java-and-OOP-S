class Box<T>{
    private T data;
    public void setValue(T data){
        this.data=data;
    }

    public T getValue(){
        return data;
    }
}

public class Genericcs_Type {
    public static void main(String[] args) {
        Box<Integer> intBox=new Box<>();
        intBox.setValue(10);
        System.out.println("The Integer Value: " + intBox.getValue());

        Box<String> strBox=new Box<>();
        strBox.setValue("Hello Generics");
        System.out.println("The String Value is: " + strBox.getValue());
    }
}
