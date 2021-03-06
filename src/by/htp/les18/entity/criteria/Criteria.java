package by.htp.les18.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();

	public Criteria(){
	}

	public Set<String> getNameCriteria(){return criteria.keySet();}

	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	
	public String getGroupSearchName() {
		return groupSearchName;
	}

	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Object get(String searchCriteria) {
		return criteria.get(searchCriteria);
	}
	// you may add your own code here

}
