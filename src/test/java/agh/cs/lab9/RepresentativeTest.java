package agh.cs.lab9;

import agh.cs.lab9.json.RepresentativeCreator;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class RepresentativeTest {
    @Test
    public void countSpendingsInYear() throws Exception {
        Representative representative174 = new RepresentativeCreator(174).createRepresentative();
        assertEquals(0, representative174.countSpendingsInYear(2013), 0.01);
    }

}