package springboothand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboothand.config.AuthorSettings;

/**
 * @author Gavin
 * @date 2018年7月10日
 */
@RestController
@SpringBootApplication
public class SpringboothandApplication {
    
    @Autowired
    private AuthorSettings authorSettings;

    @RequestMapping("/")
    public String index(){
        return "book.author:" + authorSettings.getName() + "age:" + authorSettings.getAge();
    } 
    
    public static void main(String[] args) {
        SpringApplication.run(SpringboothandApplication.class, args);
    }
}
