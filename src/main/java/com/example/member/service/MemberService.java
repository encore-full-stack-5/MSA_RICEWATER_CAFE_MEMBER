package com.example.member.service;

public interface MemberService {
    /*
     * @param userId
     * @return Cafe
     * @method GET
     *
     * 내가 가입한 카페 목록을 조회한다
     */


    /*
     * @param memberId
     * @return Member
     * @method GET
     *
     * 카페 멤버를 조회한다 (단일 조회)
     */


    /*
     * @param cafeId
     * @return Member
     * @method GET
     *
     * 카페별 가입된 멤버를 조회한다
     */


    /*
     * @param userId, cafeId
     * @return Member
     * @method POST
     *
     * 카페에 가입한 멤버 추가한다
     */


    /*
     * @param memberId, cafeId
     * @return Member
     * @method PUT
     *
     * 멤버 정보 수정한다
     */


    /*
     * @param memberId, cafeId
     * @return memberId
     * @method PUT
     *
     * 멤버 카페 탈퇴
     */


}