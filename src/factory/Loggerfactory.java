package factory;

public class Loggerfactory extends Abstractfactory {

	public Loggerfactory(boolean b) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Ilogger createLogger() {
		// TODO Auto-generated method stub
		
		return new LogConsole();
	}

}
