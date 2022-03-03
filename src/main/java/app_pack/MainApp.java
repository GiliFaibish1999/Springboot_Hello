package app_pack;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      HelloGili obj = (HelloGili) context.getBean("helloGili");
	      obj.getMessage();
	      SpringApplication.run(MainApp.class, args);
	   }
}
