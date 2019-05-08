package factory;

public class LogConsole implements Ilogger {

	@Override
	public void log(String string, String string2) {
		// TODO Auto-generated method stub
		System.out.println("vous etes logé avec le fichier");
		System.out.println(string2);
		
	}

}
