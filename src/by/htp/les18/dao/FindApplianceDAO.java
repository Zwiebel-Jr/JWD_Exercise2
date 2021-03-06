package by.htp.les18.dao;

import java.util.List;

import by.htp.les18.entity.Appliance;
import by.htp.les18.entity.criteria.Criteria;

public interface FindApplianceDAO {

	List<Appliance> findByParameters(Criteria criteria) throws DAOException;

	List<Appliance> findByCategory(String name) throws DAOException;
}
