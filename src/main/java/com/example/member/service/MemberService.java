package com.example.member.service;

import com.example.member.dto.request.MemberRequest;
import com.example.member.dto.response.MemberResponse;
import com.example.member.global.domain.entity.Member;

import java.util.List;

public interface MemberService {
    /*
     * @param userId
     * @return Cafe
     * @method GET
     *
     * 내가 가입한 카페 목록을 조회한다
     */


    /*
     * @param memberId, cafeId
     * @return Member
     * @method GET
     *
     * 카페 멤버를 조회한다 (단일 조회)
     */
    MemberRequest getMemberByMemberId(Long memberId, Long cafeId);

    /*
     * @param cafeId
     * @return Member
     * @method GET
     *
     * 카페별 가입된 멤버를 조회한다
     */
    List<MemberResponse> getCafeMembersByCafeId(Long cafeId);

    /*
     * @param userId, memberRequest
     * @return Member
     * @method POST
     *
     * 카페에 가입한 멤버를 추가한다
     */
    void createMemberId(Long userId, MemberRequest memberRequest);

    /*
     * @param memberId, memberRequest
     * @return Member
     * @method PUT
     *
     * 멤버 정보 수정한다 (닉네임 중복 X)
     */
    MemberRequest updateMemberId(Long memberId, MemberRequest memberRequest);

    /*
     * @param memberId, cafeId
     * @return memberId
     * @method PUT
     *
     * 멤버 카페 탈퇴
     */
    MemberRequest deletedMemberId(Long memberId, Long cafeId);
}