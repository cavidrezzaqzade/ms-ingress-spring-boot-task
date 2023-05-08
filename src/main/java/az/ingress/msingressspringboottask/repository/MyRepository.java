package az.ingress.msingressspringboottask.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author caci
 */

@Component
public interface MyRepository {
    default String getName(){
        return "Cavid";
    };
}
