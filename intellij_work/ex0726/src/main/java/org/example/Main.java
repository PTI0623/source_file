package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static AnnotationConfigApplicationContext acac = null;
    public static void listCommand(){
         MemberService memberService= acac.getBean(MemberService.class);
         memberService.list();
    }
    public static void newCommand(MemberDto md){
        MemberService memberService= acac.getBean(MemberService.class);
        try{
            memberService.regist(md);
        }
        catch (Exception e){
            System.out.println("email 중복되서 넣을수 없음");
        }

    }
    public static void main(String[] args) throws IOException {
        acac= new AnnotationConfigApplicationContext(ClassConfig.class);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MemberDto md1 = new MemberDto("bb@daum.net","홍길동","1234");
        try{
            while(true){
                //명령어 입력
                System.out.println("1.list 2.new aa@naver.com 3.exit");
                String cmd = br.readLine();
                if(cmd.equalsIgnoreCase("list")){
                    listCommand();
                    //리스트출력
                }
                else if(cmd.startsWith("new")){
                    try {
                        String email = cmd.split(" ")[1];
                        String name = cmd.split(" ")[2];
                        String pwd = cmd.split(" ")[3];
                        MemberDto md = new MemberDto(name,pwd,email);
                        newCommand(md);
                    }
                    catch(ArrayIndexOutOfBoundsException ie){
                        System.out.println("new aa@naver.com 김길동 1234 형식으로 입력하세요\n띄어쓰기 필수");
                    }
                        System.out.println("등록되었습니다.");

                    //입력
                }
                else if (cmd.equalsIgnoreCase("exit")) {
                    System.out.println("종료합니다");
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            acac.close();
        }
//        MemberDao dao = acac.getBean(MemberDao.class);
//        insert(new MemberDto("홍길동","aaa","bbb"));
//        if (MemberDao.memberlist.size()==0) System.out.println("내용없음");
//        dao.selectAll().forEach(dto_member -> System.out.println(dto_member));
//        System.out.println();
    }
}