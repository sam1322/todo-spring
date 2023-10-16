package com.dummyClone.redditClone.Learning_Purpose_Only;

import com.dummyClone.redditClone.config.MyBeans.MyBean;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@Controller
//@RequestMapping("api")
//public class HelloWorldController {
//    @GetMapping("/v1/hello")
//    public @ResponseBody String Hello(){
//        return "Hello World";
//    }
//}
@RestController
@RequestMapping("api")
//@Slf4j
@Log
@RequiredArgsConstructor
public class HelloWorldController {

    private final HelloService helloService;
    private final MyBean myBean;
    @GetMapping("/v1/hello")
    public String Hello() {
        log.info("Printing hello world");
        System.out.println("myBean hashcode = "+myBean.hashCode());

        return "Hello World";
    }

    @PostMapping("/v1/h2db")
    public void H2Db() {
        log.info("messing around with database");
        helloService.run();
        return;
    }
}