package agh.cs.lab9;

import agh.cs.lab9.json.RepresentativeCreator;
import agh.cs.lab9.json.RepresentativeUpdater;
import agh.cs.lab9.json.SejmometrCreator;
import agh.cs.lab9.json.SejmometrUpdater;
import agh.cs.lab9.json.sejmometr.SejmometrAPI;
import com.google.gson.*;

import javax.xml.ws.Response;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.getJSON;


/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class Main {

    public static void main(String[] args) throws IOException{
        //Representative representative174 = new RepresentativeCreator(261).createRepresentative();
        //System.out.println(representative174.representativeSpendingsAPI.toString());


        //new RepresentativeUpdater(174, "poslowie/").updateAllFiles();
        new SejmometrUpdater(8).update();


        //Representative representative = new RepresentativeCreator(395).createRepresentative();
    }


}
