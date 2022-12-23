package GeoTreeProgramm;

public class Woman extends Person{

    private Woman mother;
    private Man father;
    private Man hasbend;

    public Woman(String name, int age, boolean alive){
        super(name);
        super.age = age;
        super.alive = alive;
        super.gender = Gender.woman;
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

    public Man getHasbend() {
        return hasbend;
    }

    // как-то бы закрыть доступ к этому методу и оставь доступ только из класса муж
    public void setHasbend(Man hasbend) {
        this.hasbend = hasbend;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
}
