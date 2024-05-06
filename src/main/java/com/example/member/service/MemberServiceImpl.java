package com.example.member.service;

import com.example.member.dto.request.MemberRequest;
import com.example.member.dto.response.MemberResponse;
import com.example.member.global.domain.entity.Member;
import com.example.member.global.domain.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    // 카페 멤버 조회 (단일 조회)
    @Override
    public MemberRequest getMemberByMemberId(Long memberId, Long cafeId) {
        return memberRepository.findAllById(memberId, cafeId);
    }

    // 카페별 가입된 멤버 조회
    @Override
    public List<MemberResponse> getCafeMembersByCafeId(Long cafeId) {
        return memberRepository.findMembersByCafeId(cafeId)
                .stream()
                .map(MemberResponse::from)
                .toList();
    }

    // 카페에 가입한 멤버 추가
    @Transactional
    @Override
    public void createMemberId(Long userId, MemberRequest memberRequest) {
        Member memberEntity = memberRequest.toEntity();
        memberRepository.save(memberEntity, userId);
    }

    // 멤버 정보 수정
    @Override
    public MemberRequest updateMemberId(Long memberId, MemberRequest memberRequest) {
        return null;
    }

    // 멤버 카페 탈퇴
    @Override
    public MemberRequest deletedMemberId(Long memberId, Long cafeId) {
        return null;
    }
}