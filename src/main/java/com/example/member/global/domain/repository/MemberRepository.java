package com.example.member.global.domain.repository;

import com.example.member.dto.request.MemberRequest;
import com.example.member.dto.request.UpdateMemberRequest;
import com.example.member.global.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {
    /*
     * SELECT M.*
     *   FROM CAFE_MEMBERS M
     *  WHERE MEMBER_STATUS = ?
     *    AND USER_ID = ?
     */
    List<Member> findByMemberStatusAndUserId(Boolean memberStatus, Long userId);

    /*
     * SELECT M.*
     *   FROM CAFE_MEMBERS M
     *  WHERE MEMBER_STATUS = 0
     */
//    Boolean findByisMemberStatusFalse(Boolean memberStatus);

    /*
     * SELECT M.*
     *   FROM CAFE_MEMBERS M
     *  WHERE CAFE_ID = ?
     */
    List<Member> findMembersByCafeId(Long cafeId);
}