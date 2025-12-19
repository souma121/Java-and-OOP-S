public class ass91 {
    public static void main(String[] args) {
        try{
            try{
                int a=10/0;
            }
            catch(Exception e){
                System.out.println("Caught");
            }
            int arr[]=new int[5];
            arr[10]=50;
        }
        catch (Exception e) {
                System.out.println("No no Caught");
        }
        
        finally{
            System.out.println("Finally will always executed");
        }
    }
}

