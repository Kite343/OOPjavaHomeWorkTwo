package ManAndPet2;

public class Cat extends Pet implements PetActions{

    public Cat(int age, double weight, String name) {
        super(age, weight);
        super.name = name;
    }

    @Override
    public String toString() {
        return name + ", "  + super.toString();
    }

    @Override
    public void askFood(Person person) {
        if(person.getAtHome()){
            System.out.println(super.name + " подошел к " + person.getName());
            getSay();
        }
        else{
            System.out.println(person.getName() + " нет дома");
            System.out.println(super.name + " свернулся клубочком у миски в ожидании  " + person.getName());
        }
        
    }

    @Override
    public void eat(Bowl bowl) {
        if(bowl.getFill()){
            super.full = true;
            System.out.println(super.name + " накормлен");
            bowl.setFill(false);
            bowl.setClean(false);
        }
        else{
            System.out.println("Кот проверил миску\nМиска путса :( Коту нечего есть");
        }
        
    }

    @Override
    public void getSay() {
        System.out.println("Мяу!");
        
    }
   
}
