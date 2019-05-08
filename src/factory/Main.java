package factory;

public class Main {
	
public static void main(String [] args)
	{
		Abstractfactory fatory = new Loggerfactory(true);
		Ilogger logger = fatory.createLogger();
		logger.log(Main.class.toString(),"Bonjour");
		logger.log(Main.class.toString(),"le");
		logger.log(Main.class.toString(),"Monde");
	}
}
