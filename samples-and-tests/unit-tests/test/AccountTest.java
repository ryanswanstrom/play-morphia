
import models.Account;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import play.test.UnitTest;

public class AccountTest extends UnitTest {
    
    @Before
    public void setup() {
        Account.deleteAll();
    }

    @Test
    public void testDeleteAll() {
//        Account before = new Account("loginxyz", "a@a.a");
//        before.save();
//        Account.deleteAll();
//        Assert.assertEquals(0, Account.count());
    }

    @Test
    public void testFindAll() {
        Account.findAll();
    }

    @Test
    public void testUnique() {
//        Account before = new Account("loginxyz", "a@a.a");
//        before.save();
//        before = new Account("loginxyz", "a@a.a");
//        try {
//            before.save();
//        } catch (Exception e) {
//            assertTrue(true);
//            return;
//        }
//        assertFalse(true);
    }

}
