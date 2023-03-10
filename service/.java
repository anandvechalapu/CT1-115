·       User should able to access the page if user has access.·       If user doesn’t have access then redirect to login page.·       Validate the given Input data based on the validation rules.·       If the validations are failed display respectives validation errors .·       If no validation errors then update Global Settings/Setup Values.·       Submit and Reset buttons are given on this screen.·       Once Users have made User selections click on Submit will add/edit the wholesaler or click on Reset to reset the selections to the last search.

import org.springframework.stereotype.Service;

@Service
public class GlobalSettingsService {

    public boolean checkUserAccess(){
        //Check if user has access to the Global Settings page
        //Redirect to login page if user doesn't have access
        return true;
    }

    public boolean validateData(String[] data){
        //Validate the given input data based on the validation rules
        //Display respectives validation errors if the validations are failed
        return true;
    }

    public void updateGlobalSettings(String[] data){
        //Update Global Settings/Setup Values
        //If no validation errors
    }

    public void submitData(String[] data){
        //Once Users have made User selections click on Submit
        //It will add/edit the wholesaler
    }

    public void resetData(String[] data){
        //Click on Reset to reset the selections to the last search
    }

}