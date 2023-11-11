package com.example.core2.member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
