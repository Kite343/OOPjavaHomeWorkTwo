package GeoTreeProgramm;

import java.util.ArrayList;

public interface Researchs {
    public ArrayList<String> spend(Person p, Relationship re);
    
    public ArrayList<Person> getPers(Person p, Relationship re);

    
    
    public ArrayList<Person> hierarchy(Person p, Relationship re);

    public void printHierarchy(Person p, Relationship re);

}
