package da_hinh;

import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args) {
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(new Cat());
        animalArrayList.add(new Bird());

        for(Animal animal: animalArrayList){
            animal.tiengKeu();
            if(animal instanceof Bird){
                ((Bird) animal).fly();
            }
        }
    }
}
