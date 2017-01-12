package agh.cs.lab9.parser;

import agh.cs.lab9.Sejmometr;
import agh.cs.lab9.json.LocalSejmometrCreator;
import agh.cs.lab9.parser.ChosenOption;
import agh.cs.lab9.parser.OptionsParser;
import agh.cs.lab9.parser.SelectInterpreter;
import com.neovisionaries.i18n.CountryCode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mieszkomakuch on 23.12.2016.
 */
public class SelectInterpreterTest {
    @Test
    public void interpretSelectJaroslawKaczynskiSpendingsIn2013() throws Exception {
        String[] args = {"select", "Jarosław Kaczyński", "spendings", "in", "2013"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Jarosław Kaczyński's (id=152) spendings in 2013: 279684.06 zł",
                new SelectInterpreter(chosenOption).interpret());

    }

    @Test
    public void interpretSelectJaroslawKaczynskiSpendingsIn2012() throws Exception {
        String[] args = {"select", "Jarosław Kaczyński", "spendings", "in", "2012"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Jarosław Kaczyński's (id=152) spendings in 2012: 138636.37 zł",
                new SelectInterpreter(chosenOption).interpret());

    }

    @Test
    public void interpretSelectEwaZmudaTrzebiatowskaSpendingsIn2013() throws Exception {
        String[] args = {"select", "Ewa Żmuda-Trzebiatowska", "spendings", "in", "2013"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Ewa Żmuda-Trzebiatowska's (id=459) spendings in 2013: 245201.91 zł",
                new SelectInterpreter(chosenOption).interpret());

    }

    @Test
    public void interpretSelectArmandKamilRyfinskiSpendingsIn2013() throws Exception {
        String[] args = {"select", "Armand Kamil Ryfiński", "spendings", "in", "2013"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Armand Kamil Ryfiński's (id=337) spendings in 2013: 145481.26 zł",
                new SelectInterpreter(chosenOption).interpret());

    }

    @Test
    public void interpretSelectJaroslawKaczynskiOfficeSpendingsIn2013() throws Exception {
        String[] args = {"select", "Jarosław Kaczyński", "office", "spendings", "in", "2013"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Jarosław Kaczyński's (id=152) office renovation spendings in 2013: 0.00 zł",
                new SelectInterpreter(chosenOption).interpret());
    }

    @Test
    public void interpretSelectSlawomirKlosowskiOfficeSpendingsIn2013() throws Exception {
        String[] args = {"select", "Sławomir Kłosowski", "office", "spendings", "in", "2013"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Sławomir Kłosowski's (id=174) office renovation spendings in 2013: 2170.09 zł",
                new SelectInterpreter(chosenOption).interpret());
    }

    @Test
    public void interpretSelectAvgSpendingsIn2013() throws Exception {
        String[] args = {"select", "avg", "spendings", "in", "2013"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Average representatives spendings in 2013: 141090.07 zł",
                new SelectInterpreter(chosenOption).interpret());
    }

    @Test
    public void interpretSelectAvgSpendingsIn2012() throws Exception {
        String[] args = {"select", "avg", "spendings", "in", "2012"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Average representatives spendings in 2012: 131157.53 zł",
                new SelectInterpreter(chosenOption).interpret());
    }

    @Test
    public void interpretSelectRepresentativeWithMaxTripsTerm8() throws Exception {
        String[] args = {"select", "representative", "with", "max", "trips", "term", "8"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Representative with the biggest number of trips: " +
                        "Jan Dziedziczak (id=81) (Number of trips: 47)",
                new SelectInterpreter(chosenOption).interpret());

    }

    @Test
    public void interpretSelectRepresentativeWithMaxTripsTerm7() throws Exception {
        String[] args = {"select", "representative", "with", "max", "trips", "term", "7"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Representative with the biggest number of trips: " +
                        "Tadeusz Iwiński (id=134) (Number of trips: 72)",
                new SelectInterpreter(chosenOption).interpret());


    }

    @Test
    public void interpretSelectRepresentativeWithTheLongestTripsTerm7() throws Exception {
        String[] args = {"select", "representative", "with", "the", "longest", "trips", "term", "7"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Representative with the biggest number of days abroad: " +
                        "Tadeusz Iwiński (id=134) (Number of days abroad: 272)",
                new SelectInterpreter(chosenOption).interpret());

    }

    @Test
    public void interpretSelectRepresentativeWithTheLongestTripsTerm8() throws Exception {
        String[] args = {"select", "representative", "with", "the", "longest", "trips", "term", "8"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Representative with the biggest number of days abroad: " +
                        "Jan Dziedziczak (id=81) (Number of days abroad: 165)",
                new SelectInterpreter(chosenOption).interpret());

    }

    @Test
    public void interpretSelectRepresentativeWithTheMostExpensiveTripsTerm7() throws Exception {
        String[] args = {"select", "representative", "with", "the", "most", "expensive", "trip", "term", "7"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Representative with the most expensive trip: " +
                        "Adam Szejnfeld (id=376) (Chost of the trip: 27529.35 zł)",
                new SelectInterpreter(chosenOption).interpret());

    }

    @Test
    public void interpretSelectRepresentativeWithTheMostExpensiveTripsTerm8() throws Exception {
        String[] args = {"select", "representative", "with", "the", "most", "expensive", "trip", "term", "8"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Representative with the most expensive trip: " +
                        "Witold Waszczykowski (id=414) (Chost of the trip: 27305.58 zł)",
                new SelectInterpreter(chosenOption).interpret());

    }

    @Test
    public void interpretSelectRepresentativesWhoVisitedItalyTerm7() throws Exception {
        //Creating expected representatives list
        Sejmometr sejmometr = new LocalSejmometrCreator(7).createSejmometr();
        String expectedList =
                sejmometr.getRepresentativesWhoVisitedCountry(CountryCode.getByCode("IT")).toString();

        String[] args = {"select", "representatives", "who", "visited", "Italy", "term", "7"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Representatives who visited Italy in 7 term: " + expectedList,
                new SelectInterpreter(chosenOption).interpret());
    }

    @Test
    public void interpretSelectRepresentativesVisitedItalyTerm7() throws Exception {
        //Creating expected representatives list
        Sejmometr sejmometr = new LocalSejmometrCreator(7).createSejmometr();
        String expectedList =
                sejmometr.getRepresentativesWhoVisitedCountry(CountryCode.getByCode("IT")).toString();

        String[] args = {"select", "representatives", "visited", "Italy", "term", "7"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Representatives who visited Italy in 7 term: " + expectedList,
                new SelectInterpreter(chosenOption).interpret());
    }

    @Test
    public void interpretSelectRepVisitedItalyTerm7() throws Exception {
        //Creating expected representatives list
        Sejmometr sejmometr = new LocalSejmometrCreator(7).createSejmometr();
        String expectedList =
                sejmometr.getRepresentativesWhoVisitedCountry(CountryCode.getByCode("IT")).toString();

        String[] args = {"select", "rep", "visited", "Italy", "term", "7"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Representatives who visited Italy in 7 term: " + expectedList,
                new SelectInterpreter(chosenOption).interpret());
    }

    @Test
    public void interpretSelectRepVisitedItTerm7() throws Exception {
        //Creating expected representatives list
        Sejmometr sejmometr = new LocalSejmometrCreator(7).createSejmometr();
        String expectedList =
                sejmometr.getRepresentativesWhoVisitedCountry(CountryCode.getByCode("IT")).toString();

        String[] args = {"select", "rep", "visited", "It", "term", "7"};
        ChosenOption chosenOption = new OptionsParser(args).getChosenOption();
        assertEquals("Representatives who visited Italy in 7 term: " + expectedList,
                new SelectInterpreter(chosenOption).interpret());
    }

}