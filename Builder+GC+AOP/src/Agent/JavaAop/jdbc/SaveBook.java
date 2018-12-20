package Agent.JavaAop.jdbc;

import Agent.JavaAop.jdbcnew.ConnectionAdvice;
import org.springframework.stereotype.Component;

@Component
public class SaveBook {

    public String save(String a,int b){
        System.out.println(ConnectionAdvice.threadLocal.get());

        return "光";
    }

}
