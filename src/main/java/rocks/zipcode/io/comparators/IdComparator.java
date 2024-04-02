package rocks.zipcode.io.comparators;
import rocks.zipcode.io.Item;

import java.util.Comparator;
/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {
    @Override
    public int compare(Item item, Item t1) {
        return (int) (item.getId()- t1.getId());
    }


}
