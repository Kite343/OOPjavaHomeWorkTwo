package ManAndPet2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Person alex = new Person("Алксей", 30);
        Bowl blueBowl = new Bowl();
        Cat vasya = new Cat(12, 3.2, "Васька");
        alex.addPets(vasya);
        Cat barsik = new Cat(10, 2.2, "Барсик");
        alex.addPets(barsik);
        Dog sharik = new Dog(24, 17.5, "Шарик");
        alex.addPets(sharik);
        Dog reks = new Dog(28, 50.5, "Рекс");
        alex.addPets(reks);
        Bird kesha = new Bird(10, 0.3, "Кеша");
        alex.addPets(kesha);

        System.out.println(alex.toString());
        System.out.println(blueBowl.toString());


        // Выберем питомцев, которых можно покормить, у которых есть интерфейс PetActions
        for (Pet pet : alex.getPets()) {
            System.out.println(pet.toString());
        }
        
        System.out.println();

        ArrayList<PetActions> petActions = new ArrayList<>();
        for (Pet pet : alex.getPets()) {
            if(pet instanceof PetActions){
                petActions.add((PetActions) pet);
                System.out.println("Добавили " + pet.getName());
            }            
        }

        System.out.println();

        alex.setAtHome(false);
        for (PetActions pet : petActions) {
            manAndPet(pet, alex, blueBowl);
        }
                
    }

    private static void manAndPet(PetActions pet, Person men, Bowl bowl) {
        
        pet.askFood(men);
        men.setAtHome(true);
        menAtHome(men);
        pet.askFood(men);
        System.out.println(men.getName() + " идёт кормить питомца");
        men.fillBowl(bowl);
        pet.eat(bowl);
        pet.getSay();
        men.cleanBowl(bowl);
        men.fillBowl(bowl);
        pet.eat(bowl);
        men.setAtHome(false);
        System.out.println();

    }

    private static void menAtHome(Person men) {
        if(men.getAtHome()){
            System.out.println("Хозяин дома");
        }
        else{
            System.out.println("Хозяина нет дома");
        }
    }
}
