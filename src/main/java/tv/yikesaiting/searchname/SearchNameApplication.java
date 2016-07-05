package tv.yikesaiting.searchname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by littlekeng on 16/7/4.
 */
@RestController
@SpringBootApplication
@CrossOrigin(origins = "http://localhost:63343",maxAge = 3600)
public class SearchNameApplication {
    @RequestMapping(name = "/search")
    public Person searchPersonName(){
        return new Person("zhang",22,"Beijing");
    }
    public static void main(String[] args){
        SpringApplication.run(SearchNameApplication.class,args);
    }
}
