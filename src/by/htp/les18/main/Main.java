package by.htp.les18.main;

import by.htp.les18.controller.ApplianceController;
import by.htp.les18.controller.Controller;

public class Main {

	public static void main(String[] args) {
		Controller controller = new ApplianceController();
				
		String request;
		String response;

		request = "findbycategory _|_ category = Oven";
		response = controller.doAction(request);
		System.out.println(response);

		request = "findbyparameters _|_ category = Kettle _|_ PRICE = 50";
		response = controller.doAction(request);
		System.out.println(response);

	}

}
