package ManAndPet2;

public class Bird extends Pet{

    public Bird(int age, double weight, String name) {
        super(age, weight);
        super.name = name;
    }

    @Override
    public String toString() {
        return name + ", "  + super.toString();
    }
}
