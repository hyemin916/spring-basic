package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemoryMemberRepository;

public class FixedDiscountPolicy extends MemoryMemberRepository implements DiscountPolicy {

    private int discountFixedAmount = 1000; // 1000원 할인

    @Override
    public int discount(final Member member, final int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixedAmount;
        } else {
            return 0;
        }
    }
}
