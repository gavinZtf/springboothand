package springboothand.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Gavin
 * @date 2018年7月10日
 */
@Component
@ConfigurationProperties(prefix = "author")
public class AuthorSettings {

    private String name;
    
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
