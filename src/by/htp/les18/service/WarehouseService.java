package by.htp.les18.service;

import java.util.List;

import by.htp.les18.dao.DAOException;
import by.htp.les18.entity.Appliance;
import by.htp.les18.entity.criteria.Criteria;

public interface WarehouseService {
	List<Appliance> findByParameters(Criteria criteria) throws ServiceException;

	List<Appliance> findByCategory(String name)  throws ServiceException;

}
