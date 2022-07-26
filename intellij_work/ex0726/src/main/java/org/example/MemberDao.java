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
    public void insert(MemberDto dto){
        data.put(dto.getEmail(),dto);
    }

}
