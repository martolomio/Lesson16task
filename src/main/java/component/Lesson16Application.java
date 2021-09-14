package component;

import component.dao.StudentDao;
import component.domain.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lesson16Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Lesson16Application.class, args);

		StudentDao studentDao = ctx.getBean(StudentDao.class);

		studentDao.create(new Student(1,"Lina",19));
		studentDao.create(new Student(2,"Kira",18));
		studentDao.create(new Student(3,"Poul",20));
		studentDao.create(new Student(4,"Mike",17));
		studentDao.readAll().stream().forEach(System.out::println);
		studentDao.update(new Student(2,"Ross", 21));
		studentDao.delete(4);
		studentDao.readAll().stream().forEach(System.out::println);
	}

}
