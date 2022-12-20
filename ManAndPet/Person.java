package ManAndPet;

public class Person {
    private String name;
    private int age;

    private boolean atHome;

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
    
    public void cleanBowl(Bowl bowl){
        bowl.setClean(true);
    }

    public void fillBowl(Bowl bowl) {
        if(bowl.getClean()){
            bowl.setFill(true);
            System.out.println("Корм положен");
        }
        else{
            System.out.println("Миска грязная, надо её помыть");
        }
    }

}
