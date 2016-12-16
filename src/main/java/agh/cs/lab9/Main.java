package agh.cs.lab9;

import agh.cs.lab9.json.RepresentativeCreator;
import agh.cs.lab9.json.sejmometr.SejmometrAPI;
import com.google.gson.Gson;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;


/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class Main {

    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            Representative representative174 = new RepresentativeCreator(261).createRepresentative();
            System.out.println(representative174.representativeTripsAPI.toString());
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
