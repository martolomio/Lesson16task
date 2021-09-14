package component.confiduration;

import component.dao.StudentDao;
import component.dao.implement.StudentDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {
    @Bean
    StudentDao studentDao(){
        return  new StudentDaoImpl() ;
    }
}
