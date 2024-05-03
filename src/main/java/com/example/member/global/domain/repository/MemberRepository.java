package com.example.member.global.domain.repository;

import com.example.member.global.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    /*
     * 내가 가입한 카페 목록을 조회한다
     * select * from cafe_members where user_id = ?
     */


    /*
     * 카페 멤버를 조회한다 (단일 조회)
     * select * from cafe_members where cafe_id = ? and member_id = ?
     */


    /*
     * 카페별 가입된 멤버를 조회한다
     * select * from cafe_members where cafe_id = ?
     */


    /*
     * 카페에 가입한 멤버 추가한다
     * insert
     */


    /*
     * 멤버 정보 수정한다
     * update
     */


    //  select * from cafe_members where member_id = ?
//    List<Member> findByMemberId(int memberId);
    // 필요한 쿼리 넣어
}