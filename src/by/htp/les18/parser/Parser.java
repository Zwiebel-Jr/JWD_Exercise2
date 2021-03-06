package by.htp.les18.parser;

import java.util.HashMap;
import java.util.Map;

public class Parser {
    private static final String CATEGORY_DELIMITER = " : ";
    private static final String VALUE_DELIMITER = "=";
    private static final String PARAMETERS_DELIMITER = ", ";

    public Map<String, String> parsParameters(String line) {
        String[] productCharacteristics = line.split(CATEGORY_DELIMITER);
        Map<String, String> params = new HashMap<>();
        String[] characteristics = productCharacteristics[1].split(PARAMETERS_DELIMITER);
        for (String characteristic : characteristics) {
            String[] parameter = characteristic.split(VALUE_DELIMITER);
            params.put(parameter[0], parameter[1]);
        }
        return params;
    }

    public String parsCategory(String line) {
        return line.split(CATEGORY_DELIMITER)[0];
    }

}
