package command;

// REFACTOR ME. I SHOULD BE A SINGLETON!

public class Console{
    
	private volatile static Console uniqueInstance;
	
	private Console(){
		
	}
	
	public static Console getInstance(){
		if (uniqueInstance==null){
    		synchronized(Console.class){
    			if (uniqueInstance==null){
    			uniqueInstance = new Console();
    			}
    		}
		}
		return uniqueInstance;
	}
	

    public void print(String toPrint){
	System.out.println(toPrint);
    }
}