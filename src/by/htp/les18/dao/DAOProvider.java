package by.htp.les18.dao;

import by.htp.les18.dao.impl.FileFindApplianceDAO;

public final class DAOProvider {
	
	private static final DAOProvider instance = new DAOProvider();

	private final FindApplianceDAO findApplianceDAO = new FileFindApplianceDAO();
	
	private DAOProvider() {}

	public FindApplianceDAO getFindApplianceDAO() {
		return findApplianceDAO;
	}

	public static DAOProvider getInstance() {
		return instance;
	}	
}
