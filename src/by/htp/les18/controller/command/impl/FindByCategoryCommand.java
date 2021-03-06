package by.htp.les18.controller.command.impl;

import by.htp.les18.controller.command.Command;
import by.htp.les18.entity.Appliance;
import by.htp.les18.service.ServiceException;
import by.htp.les18.service.ServiceProvider;
import by.htp.les18.service.WarehouseService;

import java.util.List;

public class FindByCategoryCommand implements Command {

	@Override
	public String execute(String request) {
		String[] params = request.split("\\s+_\\|_\\s+");
		String category = params[1].split("\\s+=\\s+")[1];

		ServiceProvider provider = ServiceProvider.getInstance();
		WarehouseService applianceService = provider.getWarehouseService();

		String response;
		try {
			List<Appliance> appliances = applianceService.findByCategory(category);
			response = appliances.toString();
		} catch (ServiceException exception) {
			//TODO: add logger
			response = "error-010";
		}

		return response;
	}

}
