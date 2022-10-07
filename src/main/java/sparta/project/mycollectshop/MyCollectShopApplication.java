package sparta.project.mycollectshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ServletComponentScan // @WebServlet 어노테이션이 동작하게 함
@SpringBootApplication
public class MyCollectShopApplication {

    public static void main(String[] args) {

        SpringApplication.run(MyCollectShopApplication.class, args);
        System.out.println("확인~~~~");

    }

}
