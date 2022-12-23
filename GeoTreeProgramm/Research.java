package GeoTreeProgramm;
import java.util.ArrayList;

// класс оставлю до проверки, вместо него будет интерфейс исследования, который будет использоваться в дереве
public class Research {
    // ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    // ArrayList<Person> resPers = new ArrayList<>();
    // Перенесла списки в методы,
    //  иначе информация при повторном вызове будет дублироваться
    // и класс будет одноразовым

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        ArrayList<String> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<Person> getPers(Person p, Relationship re) {
        ArrayList<Person> resPers = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                resPers.add(t.p2);
            }
        }
        return resPers;
    }

}
