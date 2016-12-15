package agh.cs.lab9;

import agh.cs.lab9.json.RepresentativeCreator;
import agh.cs.lab9.json.SejmometrCreator;
import agh.cs.lab9.json.sejmometr.SejmometrAPI;


/**
 * Created by mieszkomakuch on 15.12.2016.
 */
public class Main {

    public static void main(String[] args) {
        Representative representative174 = new RepresentativeCreator(261).createRepresentative();
        System.out.println(representative174.representativeTripsAPI.toString());
    }


}
