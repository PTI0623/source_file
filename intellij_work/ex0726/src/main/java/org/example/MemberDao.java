package org.example;

import java.util.Collection;
import java.util.HashMap;

public class MemberDao {
    public static HashMap<String,MemberDto> data = new HashMap<>();
    public void selectAll(){
        System.out.println("[data 출력 start]");
        if(data.size()==0) System.out.println("data 내용 없음");
        data.values().forEach(memberDto -> System.out.println(memberDto));
        System.out.println();
    }
    //emial 검사
    public String getSelectByEmail(String email){
        MemberDto dto = data.get(email);
        if(dto != null)
            return "we select the email";
        else
            return "we already exist this email";
    }
    public void insert(MemberDto dto){
        data.put(dto.getEmail(),dto);
    }

}
