package access_modifier;

public class AnimalManagement {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setId(10);

        System.out.println("id: "+animal.getId());
    }
}
