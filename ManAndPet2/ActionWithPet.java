package ManAndPet2;
/*действия с питомцами
 * взрослые (мужчины и женщины) и дети по разному будут выполнять одни и те же функции с питомцами- покормить, поиграть
 * в данной программе не будем разделять класс Person, но будет возможность при необходимости сделать это в будущем.
 */
public interface ActionWithPet {
    public void fillBowl(Bowl bowl);

    public void petTheAimal(Pet pet);
}
