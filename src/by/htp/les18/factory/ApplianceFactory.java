package by.htp.les18.factory;

import by.htp.les18.entity.*;

import java.util.Map;

public class ApplianceFactory {
    public Appliance createAppliance(String type, Map<String, String> parameters){
        Appliance appliance = null;
        switch (type){
            case "Kettle":{
                appliance = new Kettle();
                appliance.setAllParameters(parameters);
                break;
            }
            case "Laptop":{
                appliance = new Laptop();
                appliance.setAllParameters(parameters);
                break;
            }
            case "Oven":{
                appliance = new Oven();
                appliance.setAllParameters(parameters);
                break;
            }
            case "Refrigerator":{
                appliance = new Refrigerator();
                appliance.setAllParameters(parameters);
                break;
            }
            case "Speakers":{
                appliance = new Speakers();
                appliance.setAllParameters(parameters);
                break;
            }
            case "TabletPC":{
                appliance = new TabletPC();
                appliance.setAllParameters(parameters);
                break;
            }
            case "VacuumCleaner":{
                appliance = new VacuumCleaner();
                appliance.setAllParameters(parameters);
                break;
            }

        }
        return appliance;
    }
}
