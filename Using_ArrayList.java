import java.util.*;

public class Using_ArrayList {
    public static void main(String[] args) {
        List<String> familyMembers=new ArrayList<>();
        familyMembers.add("Sonali Paul");
        familyMembers.add("Soumajit Pal");
        familyMembers.add("Shruti Paul");
        familyMembers.add("Swarup Paul");
        familyMembers.add("Mandra Pal");
        familyMembers.add("Surajit Pal");

        System.out.println("The Family Members are: " + familyMembers);
        familyMembers.remove(1);
        System.out.println("After Removing: " + familyMembers);
        familyMembers.add("Soumajit Pal");
        for(String name: familyMembers){
            System.out.println("Family Members are: " + name);
        }
    }
}
