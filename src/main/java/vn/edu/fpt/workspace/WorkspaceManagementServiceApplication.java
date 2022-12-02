package vn.edu.fpt.workspace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class WorkspaceManagementServiceApplication implements CommandLineRunner {

    @Autowired
    RedisTemplate<String, Object> redisTemplate;

    public static void main(String[] args) {
        SpringApplication.run(WorkspaceManagementServiceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(redisTemplate.opsForValue().get("AUTHENTICATION"));
    }
}
