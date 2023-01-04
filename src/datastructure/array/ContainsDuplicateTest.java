package datastructure.array;

import org.junit.Assert;
import org.junit.Test;


public class ContainsDuplicateTest {

    @Test
    public void containsDuplicateWithHashMap() {
        var dup=new ContainsDuplicate();
        var rs1=dup.containsDuplicateWithHashMap(new int[]{1, 2, 3});
        var rs2=dup.containsDuplicateWithHashMap(new int[]{1, 2, 1,3});
        Assert.assertFalse(rs1);
        Assert.assertTrue(rs2);
    }
}