package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        final MemberService memberService = appConfig.memberService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        final MemberService memberService = applicationContext.getBean("memberService", MemberService.class);// name은 AppConfig의 메서드 이름
        final Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);
    }
}
