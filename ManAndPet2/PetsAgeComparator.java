package ManAndPet2;

import java.util.Comparator;

public class PetsAgeComparator  implements Comparator <Pet>{

    @Override
    public int compare(Pet o1, Pet o2) {
        return o1.getAge() - o2.getAge();
    }
    
}
