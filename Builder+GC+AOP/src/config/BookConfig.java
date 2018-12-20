package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.BookService2;
import service.Service;

@Configuration
public class BookConfig {
    @Bean
    public Service get(){
        return new BookService2();
    }
}
