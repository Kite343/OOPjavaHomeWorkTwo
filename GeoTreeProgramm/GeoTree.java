package GeoTreeProgramm;
import java.util.ArrayList;

public class GeoTree implements Researchs{
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Person p1, Person p2, Relationship r1, Relationship r2) {
        
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

    // список всех над или под человеком (потомки или предки, начальники-подчиненные)
    // пока самостоятельно только до такого варианта додумалась, надо погуглить
    private  ArrayList<Person> resHierarchy = new ArrayList<>();
    @Override
    public ArrayList<Person> hierarchy(Person p, Relationship re) {
        this.resHierarchy.clear();
        addPersResHierarchy(p, re);
        return resHierarchy;
    }

    private void addPersResHierarchy(Person p, Relationship re){
        ArrayList<Person> res = getPers(p, re);        
        if(!res.isEmpty()){
            this.resHierarchy.addAll(res);
        }
        for (Person pers : res) {
            addPersResHierarchy(pers, re);
        }        
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
