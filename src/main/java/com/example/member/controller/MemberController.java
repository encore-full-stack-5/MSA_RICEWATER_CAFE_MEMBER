package com.example.member.controller;

import com.example.member.dto.request.MemberRequest;
import com.example.member.dto.response.MemberResponse;
import com.example.member.global.domain.entity.Member;
import com.example.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/members")
public class MemberController {

    private final MemberService memberService;

    // 내가 가입한 카페 목록을 조회한다
    // @GetMapping("/myCafe")


    // 카페 멤버를 조회한다 (단일 조회)
    @GetMapping("/{id}")
    public MemberRequest getMemberByMemberId(
            @RequestParam("id") Long memberId,
            @RequestParam("cafeId") Long cafeId
    ) {
        return memberService.getMemberByMemberId(memberId, cafeId);
    }

    // 카페별 가입된 멤버를 조회한다
    @GetMapping("/cafe/{cafeId}")
    public List<MemberResponse> getCafeMembersByCafeId(
            @PathVariable("cafeId") Long cafeId
    ) {
        return memberService.getCafeMembersByCafeId(cafeId);
    }

    // 카페에 가입한 멤버를 추가한다
    @PostMapping("/{userId}")
    public void createMemberId(
            @PathVariable("userId") Long userId,
            @RequestBody MemberRequest memberRequest
    ) {
        memberService.createMemberId(userId, memberRequest);
    }

    // 멤버 정보 수정한다
    @PutMapping("/{id}")
    public MemberRequest updateMemberId(
            @PathVariable("id") Long memberId,
            @RequestBody MemberRequest memberRequest
    ) {
        return memberService.updateMemberId(memberId, memberRequest);
    }

    // 멤버 카페 탈퇴
    @PutMapping("/delete/{id}")
    public MemberRequest deletedMemberId(
            @RequestParam("id") Long memberId,
            @RequestParam("cafeId") Long cafeId
    ) {
        return memberService.deletedMemberId(memberId, cafeId);
    }
}