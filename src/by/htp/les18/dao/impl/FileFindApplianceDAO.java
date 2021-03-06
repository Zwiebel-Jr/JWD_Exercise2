package by.htp.les18.dao.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import by.htp.les18.entity.Appliance;
import by.htp.les18.dao.DAOException;
import by.htp.les18.dao.FindApplianceDAO;
import by.htp.les18.entity.criteria.Criteria;
import by.htp.les18.factory.ApplianceFactory;
import by.htp.les18.parser.Parser;

public class FileFindApplianceDAO implements FindApplianceDAO {

	private static final String PATH_TO_FILE = "resources/appliances_db.txt";

	@Override
	public List<Appliance> findByParameters(Criteria criteria) throws DAOException {
		ApplianceFactory factory = new ApplianceFactory();
		List<Appliance> appliances = new ArrayList<>();
		Set<String> nameCriteria = criteria.getNameCriteria();
		Parser parser = new Parser();
		try{
			Stream<String> lines = Files.lines(Path.of(PATH_TO_FILE));
			List<String> products = lines.filter(o -> parser.parsCategory(o).equals(criteria.getGroupSearchName())).collect(Collectors.toList());
			products = products.stream().filter(o -> {
				Map<String, String> params = parser.parsParameters(o);
				return nameCriteria.stream().allMatch(criterion -> criteria.get(criterion).toString().equals(params.get(criterion)));
			}).collect(Collectors.toList());
			for (String product : products) {
				Map<String, String> params = parser.parsParameters(product);
				appliances.add(factory.createAppliance(criteria.getGroupSearchName(), params));
			}
		}catch (IOException exception){
			throw new DAOException(exception);
		}

		return appliances;
	}

	@Override
	public List<Appliance> findByCategory(String name) throws DAOException {
		//Factory<Appliance> factory = FactoryProvider.takeFactory(name);
		ApplianceFactory factory = new ApplianceFactory();
		List<Appliance> appliances = new ArrayList<>();
		Parser parser = new Parser();
		try {
			Stream<String> lines = Files.lines(Path.of(PATH_TO_FILE));
			List<String> products = lines.filter(o -> parser.parsCategory(o).equals(name)).collect(Collectors.toList());
			for (String product : products) {
				Map<String, String> parameters = parser.parsParameters(product);
				appliances.add(factory.createAppliance(name, parameters));
			}
		} catch (IOException exception) {

			throw new DAOException(exception);
		}
		return appliances;
	}

}
