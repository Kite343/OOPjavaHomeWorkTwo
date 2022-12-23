package GeoTreeProgramm;

public class Man extends Person{

    private Woman mother;
    private Man father;
    private Woman wife;
    
    public Man(String name, int age, boolean alive){
        super(name);
        super.age = age;
        super.alive = alive;
        super.gender = Gender.man;
    }

    public Man getFather() {
        return father;
    }

    public void setFather(Man father) {
        this.father = father;
        father.addChildren(this);
    }

    public Woman getMother() {
        return mother;
    }

    public void setMother(Woman mother) {
        this.mother = mother;
        mother.addChildren(this);
    }
    
    public Woman getWife() {
        return wife;
    }

    public void setWife(Woman wife) {
        this.wife = wife;
        wife.setHasbend(this);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
