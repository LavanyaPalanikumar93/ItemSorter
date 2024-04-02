package rocks.zipcode.io.comparators;
import rocks.zipcode.io.Item;

import java.util.Comparator;
/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {
    @Override
    public int compare(Item t1, Item t2){

        return t1.getName().compareTo(t2.getName());


    }


}
