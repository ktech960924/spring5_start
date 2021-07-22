package chap05.assembler;

import chap05.spring.ChangePasswordService;
import chap05.spring.MemberDao;
import chap05.spring.MemberReegisterService;

//실체 객체를 생성하는 코드,
public class Assembler {

    private final MemberDao memberDao;
    private final MemberReegisterService regSvc;
    private final ChangePasswordService pwdSvc;

    public Assembler(){
        memberDao = new MemberDao();
        regSvc = new MemberReegisterService(memberDao);
        pwdSvc = new ChangePasswordService();
        pwdSvc.setMemberDao(memberDao);
    }

    public MemberDao getMemberDao(){
        return memberDao;
    }

    public MemberReegisterService getMemberRegisterService(){
        return regSvc;
    }

    public ChangePasswordService getChangePasswordService(){
        return pwdSvc;
    }
}
