package GeoTreeProgramm;

import java.util.ArrayList;

public abstract class Person  implements Comparable <Person>{
    protected String fullName;
    protected int age;
    protected boolean alive;    
    protected Gender gender;
    protected ArrayList<Person> childrens = new ArrayList<>();
    // protected ArrayList<Person> parents = new ArrayList<>();
    // возможно лучше список родителей, если ребенок был усыновлен, то родителей уже больше 2

    public ArrayList<Person> getChildrens() {
        return childrens;
    }

    public void setChildrens(ArrayList<Person> childrens) {
        this.childrens = childrens;
    }

    public void addChildren(Person children) {
        this.childrens.add(children);
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return this.fullName + " " + this.age + " лет";
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    
}
