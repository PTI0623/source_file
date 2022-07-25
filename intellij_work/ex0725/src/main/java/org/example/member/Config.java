package org.example.member;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config{

    @Bean
    public MemberREGService memberREGService(){
        return new MemberREGService();
    }

    @Bean
    public MemberDAO memberDAO(){
        return new MemberDAO();
    }
}
