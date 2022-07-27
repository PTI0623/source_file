package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import(ImportConfig.class)
public class ClassConfig {
    @Autowired
    public MemberDao memberDao(){
        return new MemberDao();
    }
    @Autowired
    public MemberPrinter memberPrinter(){
        return new MemberPrinter("1.0");
    }

    @Bean
    public MemberService memberService(){
        MemberService ms = new MemberService();
        ms.setMemberDao(memberDao());
        ms.setMemberPrinter(memberPrinter());
        return ms;
    }

}
