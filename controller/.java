·       Validate the given Input data based on the validation rules.·       If the validations are failed display respectives validation errors.·       If no validation errors then update Global Settings/Setup Values.·       All Weighting Factor fields, Delivery Cut-off-Efficiency and Maximum Cap Compensation entering values must be positive number and less than 100. Earliest SAT Cap Compensation can be positive number.Solution:

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalSettingsController {

	@RequestMapping(value = "/global-settings", method = RequestMethod.GET)
	public String getGlobalSettings() {
		// Get data from the database based on the given database id
		// Validate the given Input data based on the validation rules
		// Return validation errors if any
		// Else update Global Settings/Setup Values
		return "Global settings data";
	}
	
	@RequestMapping(value = "/global-settings", method = RequestMethod.POST)
	public String submitGlobalSettings() {
		// Validate the given Input data based on the validation rules
		// Return validation errors if any
		// Else update Global Settings/Setup Values
		// Submit and Reset buttons are given on this screen
		// All Weighting Factor fields, Delivery Cut-off-Efficiency and Maximum Cap Compensation entering values must be positive number and less than 100. Earliest SAT Cap Compensation can be positive number
		return "Global settings data updated successfully";
	}
}