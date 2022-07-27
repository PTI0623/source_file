package org.example;

public class MemberService {


    private MemberDao memberDao;
    private MemberPrinter memberPrinter;
    public void setMemberPrinter(MemberPrinter memberPrinter) {
        this.memberPrinter = memberPrinter;
    }

    public MemberService(){}
    public MemberService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
    public void list() {
        memberDao.selectAll();
    }

    //만약에 datamap 안에 같은 이메일이 있으면 저장할 수 없다
    //아니면 데이터 저장해야한다.
    public void regist(MemberDto md) throws Exception {
        String result = memberDao.getSelectByEmail(md.getEmail());
        if(result.equals("we select the email"))
            throw new Exception();
        else
            memberDao.insert(md);
    }
}
