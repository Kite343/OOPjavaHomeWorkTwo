package ManAndPet;

public class Cat extends Pet{

    private boolean purr;

    public Cat(int age, double weight, String name) {
        super(age, weight);
        super.name = name;
    }

    @Override
    public void getSay() {
        System.out.println("Мяу!");        
    }

    public void setPurr(boolean purr) {
        this.purr = purr;        
    }

    public void getPurr(){
        System.out.println(purr ? "Мурррр": "");
    }

    @Override
    public String toString() {
        return name + ", "  + super.toString();
    }
   
    public void eat(Bowl bowl) {
        if(bowl.getFill()){
            super.full = true;
            System.out.println(super.name + " накормлен");
            this.purr = true;
            bowl.setFill(false);
            bowl.setClean(false);
        }
        else{
            System.out.println("Кот проверил миску\nМиска путса :( Коту нечего есть");
        }
    }
}
