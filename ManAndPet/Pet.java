package ManAndPet;

public abstract class Pet {
    protected String name;

    protected int age;
    protected double weight;

    protected boolean full;
    protected boolean move;
    protected boolean sleep;
    
    public Pet(int age, double weight){
        this.age = age;
        this.weight = weight;
        this.full = false;
        this.move = false;
    }

    public void setName(String name) {
        this.name = name;        
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public void setFull(boolean full){
        this.full = full;
        // System.out.println(this.full? "Питомец сыт" : "Питомец голоден");
    }

    public boolean getFull(){
        System.out.println(this.full? "Питомец сыт" : "Питомец голоден");
        return full;
    }

    public void setMove(boolean move){
        this.move = move;
        System.out.println(this.move? "Питомец движется" : "Питомец стоит");
    }

    public boolean getMove(){
        System.out.println(this.move? "Питомец движется" : "Питомец стоит");
        return move;
    }

    public void setSleep(boolean sleep){
        this.sleep = sleep;
        System.out.println(this.sleep? "Питомец спит" : "Питомец не спит");
    }

    public boolean getSleep(){
        System.out.println(this.sleep? "Питомец спит" : "Питомец не спит");
        return sleep;
    }

    public abstract void getSay();

    @Override
    public String toString() {
        return "Возраст: " + age + " месяцев, вес: " + weight + "кг";
    }
    
}
