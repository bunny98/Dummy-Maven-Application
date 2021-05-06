package CiscoDemo.MavenApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App
{
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class); 
    public static void main( String[] args )
    {
        LOGGER.info("FIRST LOG");
        DemoClass newObj = new DemoClass();
        try {
			int a = 1 / 0;
		}catch (Exception e){
			LOGGER.warn("Exception here : ",e);
		}
    }
}
