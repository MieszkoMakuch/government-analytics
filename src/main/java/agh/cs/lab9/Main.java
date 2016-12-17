package agh.cs.lab9;

import agh.cs.lab9.json.RepresentativeCreator;
import agh.cs.lab9.json.SejmometrCreator;
import agh.cs.lab9.json.sejmometr.SejmometrAPI;
import com.google.gson.*;

import javax.xml.ws.Response;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.getJSON;


/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //Representative representative174 = new RepresentativeCreator(261).createRepresentative();
        //System.out.println(representative174.representativeSpendingsAPI.toString());

        Sejmometr sejmometr = new SejmometrCreator(7).createSejmometr();
        System.out.println(sejmometr.toString());

        PrintWriter zapis = new PrintWriter("sejmometrAllPages.txt");
        zapis.println(sejmometr.toString());
        zapis.close();

    }


}
