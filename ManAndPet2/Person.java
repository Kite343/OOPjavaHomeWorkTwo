package ManAndPet2;

import java.util.ArrayList;

public class Person implements ActionWithPet, DishesAction{
    private String name;
    private int age;

    private boolean atHome;

    private ArrayList<Pet> pets = new ArrayList<>();

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public void addPets(Pet pet) {
        this.pets.add(pet);
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        this.atHome = true;
    }

    public String getName() {
        return name;        
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setAtHome(boolean atHome) {
        this.atHome = atHome;        
    }

    public boolean getAtHome(){
        return atHome;
    }

    @Override
    public String toString() {
        return name + ", возраст: " + age;
    }

    @Override
    public void fillBowl(Bowl bowl) {
        if(bowl.getClean()){
            bowl.setFill(true);
            System.out.println("Корм положен");
        }
        else{
            System.out.println("Миска грязная, надо её помыть");
        }
        
    }

    @Override
    public void cleanBowl(Bowl bowl) {
        bowl.setClean(true);
    }
        
}
