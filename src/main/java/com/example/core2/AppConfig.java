package com.example.core2;

import com.example.core2.discount.DiscountPolicy;
import com.example.core2.discount.FixDiscountPolicy;
import com.example.core2.discount.RateDiscountPolicy;
import com.example.core2.member.MemberRepository;
import com.example.core2.member.MemberService;
import com.example.core2.member.MemberServiceImpl;
import com.example.core2.member.MemoryMemberRepository;
import com.example.core2.order.OrderService;
import com.example.core2.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
    public OrderService orderService() {
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}