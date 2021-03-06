package by.htp.les18.controller.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.les18.controller.command.impl.FindByCategoryCommand;
import by.htp.les18.controller.command.impl.FindByCriteriaImpl;
import by.htp.les18.controller.command.impl.NoFoundCommand;

public class CommandProvider {
	private Map<String, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put("findbyparameters", new FindByCriteriaImpl());
		commands.put("findbycategory", new FindByCategoryCommand());
		commands.put("nocommand", new NoFoundCommand());
	}
	
	public Command getCommand(String commandName) {
		Command command;
		
		command = commands.get(commandName);
		if(command == null) {
			command = commands.get("nocommand");
		}
		
		return command;
		
	}

}
