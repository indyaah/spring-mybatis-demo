package pro.anuj.imma.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pro.anuj.imma.service.TagService;

/**
 * 
 * @author Anuj
 *
 * Main Class For Running The Code
 */
public class Main {

	static String[] config = new String[] { "application-context.xml" };
	static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
	
	
	public static void main(String args[]) {
		TagService tagService = context.getBean(TagService.class);
		System.out.println(tagService.searchTag("p1", null, null, null));
	}

}
