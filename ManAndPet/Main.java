package ManAndPet;

public class Main {
    public static void main(String[] args){
        Person alex = new Person("Алксей", 30);
        Cat vasya = new Cat(12, 3.2, "Васька");
        Bowl blueBowl = new Bowl();

        System.out.println(alex.toString());
        System.out.println(vasya.toString());
        System.out.println(blueBowl.toString());

        if(alex.getAtHome()){
            System.out.println("Хозяин дома");
        }
        else{
            System.out.println("Хозяина нет дома");
        }
        System.out.println();

        manAndPet(vasya, alex, blueBowl);
        

    }

    private static void manAndPet(Cat cat, Person men, Bowl bowl) {
         int i = 0;
        while(!cat.getFull()){
            // System.out.println("Кот голоден");
            cat.getSay();
            System.out.println(men.getName() + " идёт кормить кота");
            men.fillBowl(bowl);
            cat.eat(bowl);
            cat.getSay();
            men.cleanBowl(bowl);
            men.fillBowl(bowl);
            cat.eat(bowl);
            cat.getPurr();
            cat.setPurr(false);
            cat.setFull(false);
            System.out.println();

            i++;
            if(i == 2){
                break;
            }
        } 
    }
}
