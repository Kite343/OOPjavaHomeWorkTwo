package GeoTreeProgramm;
import java.util.ArrayList;

public class GeoTree implements Researchs{
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person p1, Person p2, Relationship r1, Relationship r2) {
        // tree.add(new Node(p1, r1, p2));
        // tree.add(new Node(p2, r2, p1));
        tree.add(new Node(p2, r1, p1));
        tree.add(new Node(p1, r2, p2));
    }

    @Override
    public ArrayList<Person> getPers(Person p, Relationship re) {
        ArrayList<Person> resPers = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                resPers.add(t.p2);
            }
        }
        return resPers;
    }

    @Override
    public ArrayList<Person> hierarchy(Person p, Relationship re) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void printHierarchy(Person p, Relationship re) {
        ArrayList<Person> res = getPers(p, re);        
        if(!res.isEmpty()){
            System.out.println(p.getFullName() + ", " +  re + ": " + res);
        }
        for (Person pers : res) {
            printHierarchy(pers, re);
        }        
    }


    @Override
    public ArrayList<String> spend(Person p, Relationship re) {
        ArrayList<String> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }
    
}
