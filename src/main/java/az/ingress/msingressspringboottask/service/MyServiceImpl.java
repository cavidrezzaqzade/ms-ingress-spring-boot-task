package az.ingress.msingressspringboottask.service;

import az.ingress.msingressspringboottask.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author caci
 */

@Service
public class MyServiceImpl implements MyService {

//    @Autowired
    private MyRepository repository;

    public MyServiceImpl(MyRepository repository){
        this.repository = repository;
    }

    @Override
    public String getName() {
        return repository.getName();
    }
}
