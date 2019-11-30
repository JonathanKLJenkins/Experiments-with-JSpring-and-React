package Dnd.Encounter_Generator;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	EncounterGenerator list = new OrcThemed();
        //EncounterGenerator list = (EncounterGenerator) context.getBean("EncounterGenerator");
        System.out.println(list.getEncounter());
    }
}
