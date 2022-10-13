package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixedDiscountPolicy implements DiscountPolicy {

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
