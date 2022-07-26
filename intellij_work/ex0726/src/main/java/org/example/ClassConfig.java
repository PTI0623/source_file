package org.example;

import org.springframework.context.annotation.Bean;

public class ClassConfig {
    @Bean
    public MemberDao memberDao(){
        return new MemberDao();
    }

    @Bean
    public MemberService memberService(){
        MemberService ms = new MemberService();
        ms.setMemberDao(memberDao());
        return ms;
    }

}
