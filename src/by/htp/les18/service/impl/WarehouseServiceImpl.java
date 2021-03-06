package by.htp.les18.service.impl;

import java.util.List;

import by.htp.les18.dao.DAOException;
import by.htp.les18.dao.DAOProvider;
import by.htp.les18.entity.Appliance;
import by.htp.les18.entity.criteria.Criteria;
import by.htp.les18.service.ServiceException;
import by.htp.les18.service.WarehouseService;

public class WarehouseServiceImpl implements WarehouseService{

	@Override
	public List<Appliance> findByParameters(Criteria criteria) throws ServiceException {
		List<Appliance> appliances;
		try {
			appliances = DAOProvider.getInstance().getFindApplianceDAO().findByParameters(criteria);
		} catch (DAOException exception) {
			throw new ServiceException(exception);
		}
		return appliances;
	}

	@Override
	public List<Appliance> findByCategory(String name) throws ServiceException{
		List<Appliance> appliances;
		try {
			appliances = DAOProvider.getInstance().getFindApplianceDAO().findByCategory(name);
		} catch (DAOException exception) {
			throw new ServiceException(exception);
		}
		return appliances;
	}

}
