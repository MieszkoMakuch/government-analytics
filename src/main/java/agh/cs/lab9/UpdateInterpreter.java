package agh.cs.lab9;

import agh.cs.lab9.json.LocalRepresentativeCreator;
import agh.cs.lab9.json.RepresentativeUpdater;
import agh.cs.lab9.json.SejmometrUpdater;

import java.io.IOException;

/**
 * Created by mieszkomakuch on 24.12.2016.
 */
public class UpdateInterpreter extends AbstractInterpreter {
    public UpdateInterpreter(ChosenOption chosenOption) {
        super(chosenOption);
    }

    public String interpret() {
        if (this.chosenOption.equals(updateSejmometrTermNo())) {
            String result = "Updating representatives files from " + chosenOption.getTerm() + " term\n";
            try{
                new SejmometrUpdater(chosenOption.getTerm()).update();
            } catch (IOException e) {
                return result + e.getMessage();
            }
            return result + "Update process finished successfully";
        } if (this.chosenOption.equals(updateRepresentative())) {
            String result = "Updating " + chosenOption.getRepresentative().toStringS() + " files";
            try{
                new RepresentativeUpdater(chosenOption.getRepresentative().getId(),
                        SejmometrUpdater.representativeLocalFilesPath).updateAllFiles();
            } catch (IOException e) {
                return result + e.getMessage();
            }
            return result + "\nUpdate process finished successfully";
        } else {
            throw new IllegalArgumentException("Unknown chosenOption: " + chosenOption.toString());
        }
    }

    //example: "update sejmometr term 7"
    private ChosenOption updateSejmometrTermNo() {
        ChosenOption chosenOption = new ChosenOption();
        chosenOption.setStatement(Statements.UPDATE);
        chosenOption.setUpdateSet(UpdateSets.SEJMOMETR);
        return chosenOption;
    }

    //example: "update representative "Jarosław Kaczyński""
    private ChosenOption updateRepresentative() {
        ChosenOption chosenOption = new ChosenOption();
        chosenOption.setStatement(Statements.UPDATE);
        chosenOption.setUpdateSet(UpdateSets.REPRESENTATIVE);
        return chosenOption;
    }
}
