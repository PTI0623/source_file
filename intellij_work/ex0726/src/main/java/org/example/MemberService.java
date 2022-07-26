package org.example;

public class MemberService {

    public MemberService(){}
    private MemberDao memberDao;

    public MemberService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }
    public void list() {
        memberDao.selectAll();
    }
}
