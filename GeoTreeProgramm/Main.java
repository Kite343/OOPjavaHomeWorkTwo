package GeoTreeProgramm;
// import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// получилось, что задача разделилась на 2. Рассуждения в файле readme

public class Main {
    public static void main(String[] args) {
        Woman irina = new Woman("Ирина", 55, true);
        Man pavel = new Man("Павел", 60, true);

        pavel.setWife(irina);
        System.out.println(pavel.getFullName() + ", жена: " + pavel.getWife());
        System.out.println(irina.getFullName() + ", муж:  " + irina.getHasbend());
        System.out.println();

        Man vasya = new Man("Вася", 35, true);
        vasya.setMother(irina);
        vasya.setFather(pavel);
        System.out.println("У " + vasya.getFullName() +
                            " мать: " + vasya.getMother() + " и отец: " + vasya.getFather());
        System.out.println();

        Woman masha = new Woman("Маша", 25, true);
        masha. setMother(irina);
        masha.setFather(pavel);

        System.out.println("У " + irina.getFullName() +
                           " дети: " + irina.getChildrens());
        System.out.println("У " + pavel.getFullName() +
                           " дети: " + irina.getChildrens());


        Man jane = new Man("Женя", 8, true);
        jane.setFather(vasya);
        Man ivan = new Man("Ваня", 10, true);
        ivan.setFather(vasya);
        Woman olga = new Woman("Ольга", 3, true);
        olga.setMother(masha);
        System.out.println();

        GeoTree gt = new GeoTree();
        gt.append(irina, pavel, Relationship.wife, Relationship.husband);
        gt.append(irina, vasya, Relationship.parent, Relationship.children);
        gt.append(irina, masha, Relationship.parent, Relationship.children);
        gt.append(pavel, vasya, Relationship.parent, Relationship.children);
        gt.append(pavel, masha, Relationship.parent, Relationship.children);
        gt.append(vasya, jane, Relationship.parent, Relationship.children);
        gt.append(vasya, ivan, Relationship.parent, Relationship.children);
        gt.append(masha, olga, Relationship.parent, Relationship.children);

        System.out.println(gt.getTree());
        System.out.println();

        System.out.println(pavel.getFullName() + ", жена: " + String.join(", ", gt.spend(pavel, Relationship.wife)));
        System.out.println(irina.getFullName() + ", дети: " + String.join(", ", gt.spend(irina, Relationship.children)));
        System.out.println(vasya.getFullName() + ", родители: " + String.join(", ", gt.spend(vasya, Relationship.parent)));

        Comparator personeNameComp = new PersNameComparator();
                
        System.out.println();
        System.out.println("Иерархия вниз");
        gt.printHierarchy(pavel, Relationship.children);
        System.out.println();
        System.out.println("Список объектов");
        ArrayList<Person> pavelChildrens = gt.hierarchy(pavel, Relationship.children);
        System.out.println(pavelChildrens);
        Collections.sort(pavelChildrens);
        // Collections.reverse(pavelChildrens);
        System.out.println(pavelChildrens);
        Collections.sort(pavelChildrens, personeNameComp);
        System.out.println(pavelChildrens);


        System.out.println();
        System.out.println("Иерархия вверх");
        gt.printHierarchy(olga, Relationship.parent);
        System.out.println();
        System.out.println("Список объектов");
        ArrayList<Person> olgaParent = gt.hierarchy(olga, Relationship.parent);
        System.out.println(olgaParent);
        Collections.sort(olgaParent);
        Collections.reverse(olgaParent);
        System.out.println(olgaParent);
        Collections.sort(olgaParent, personeNameComp);
        System.out.println(olgaParent);

    }

}
