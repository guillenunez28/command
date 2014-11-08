package command;

public class ConsoleCommand implements Command {
	private Console command;
	private String message;
	
	public ConsoleCommand(Console command,String message){
		this.command = command;
		this.message = message;
		
	}
	
	public void execute() {
		command.print(message);
		
	}

    // IMPLEMENT ME!

}