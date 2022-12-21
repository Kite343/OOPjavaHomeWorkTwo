package ManAndPet2;

public class Dog  extends Pet implements PetActions{

    public Dog(int age, double weight, String name) {
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
            System.out.println(super.name + " пошёл к миске");
        }
        else{
            System.out.println(person.getName() + " нет дома");
            System.out.println(super.name + " лёг на пороге в ожидании  " + person.getName());
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
            System.out.println("Пёс проверил миску\nМиска путса :( Грустно смотрит на миску");
        }
        
    }

    @Override
    public void getSay() {
        System.out.println("Гав!");
        
    }

       
}
