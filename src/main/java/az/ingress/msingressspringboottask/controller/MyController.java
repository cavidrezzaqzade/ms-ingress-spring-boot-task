package az.ingress.msingressspringboottask.controller;

import az.ingress.msingressspringboottask.service.MyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author caci
 */

@RestController
@RequestMapping("api")
public class MyController {

    private MyService service;

    //@Autowired
    public MyController(MyService service){
        this.service = service;
    }

    @GetMapping("names")
    public String getName() {
        return  service.getName();
    }
}
