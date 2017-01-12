package agh.cs.lab9.parser;

import agh.cs.lab9.parser.ChosenOption;
import agh.cs.lab9.parser.UpdateParser;
import agh.cs.lab9.parser.UpdateSets;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mieszkomakuch on 24.12.2016.
 */
public class UpdateParserTest {
    @Test
    public void getChosenOptionRepresentativeUpdate() throws Exception {
        String[] args = {"update", "representative", "Jarosław Kaczyński"};
        ChosenOption chosenOption = new ChosenOption();
        chosenOption = new UpdateParser(args, chosenOption).getChosenOption(1);
        assertEquals(UpdateSets.REPRESENTATIVE, chosenOption.getUpdateSet());
        assertEquals("Jarosław Kaczyński", chosenOption.getRepresentative().getName());

    }

    @Test
    public void getChosenOptionSejmometrUpdate() throws Exception {
        String[] args = {"update", "sejmometr", "term", "7"};
        ChosenOption chosenOption = new ChosenOption();
        chosenOption = new UpdateParser(args, chosenOption).getChosenOption(1);
        assertEquals(UpdateSets.SEJMOMETR, chosenOption.getUpdateSet());
        assertEquals(7, chosenOption.getTerm());
    }

    @Test
    public void parseSejmometrUpdate() throws Exception {
        String[] args = {"update", "sejmometr", "term", "7"};
        ChosenOption chosenOption = new ChosenOption();
        chosenOption = new UpdateParser(args, chosenOption).parseSejmometrUpdate(chosenOption, 2);
        assertEquals(7, chosenOption.getTerm());

    }

    @Test
    public void parseRepresentativeUpdate() throws Exception {
        String[] args = {"update", "representative", "Jarosław Kaczyński"};
        ChosenOption chosenOption = new ChosenOption();
        chosenOption = new UpdateParser(args, chosenOption).parseRepresentativeUpdate(chosenOption, 2);
        assertEquals("Jarosław Kaczyński", chosenOption.getRepresentative().getName());
    }

}