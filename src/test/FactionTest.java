import org.junit.Test;
import org.junit.Assert;

    public class FactionTest {
        @Test
        public void CreateLoyalistFaction(){
            Faction loyalist = new Faction(7);
            Assert.assertEquals("Loyalists", loyalist.factions.toString());
            Assert.assertEquals(100, loyalist.satisfaction);
            Assert.assertEquals(15, loyalist.industry);
            Assert.assertEquals(15, loyalist.agriculture);
            Assert.assertEquals(200, loyalist.treasury);
            Assert.assertEquals(600, loyalist.reserves);
        }
        @Test
        public void CreateOtherFaction(){
                Faction loyalist = new Faction(0);
                Assert.assertEquals("Capitalists", loyalist.factions.toString());
                Assert.assertEquals(50, loyalist.satisfaction);
                Assert.assertEquals(15, loyalist.industry);
                Assert.assertEquals(15, loyalist.agriculture);
                Assert.assertEquals(200, loyalist.treasury);
                Assert.assertEquals(600, loyalist.reserves);

        }
    }


