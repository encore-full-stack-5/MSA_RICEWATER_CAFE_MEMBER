package com.example.member.dto.response;

import com.example.member.global.domain.entity.Member;

import java.time.LocalDateTime;

// 응답
public record MemberResponse(
        String profileImage,
        String nickname,
        String aboutMe,
        Boolean ageVisibilityOption,
        String joinAnswer,
        Boolean memberStatus,
        Long userId,
        Long cafeId,
        Long rankId,
        LocalDateTime joinDate
) {
    public static MemberResponse from(Member member) {
        return new MemberResponse(
                member.getProfileImage(),
                member.getNickname(),
                member.getAboutMe(),
                member.getAgeVisibilityOption(),
                member.getJoinAnswer(),
                member.getMemberStatus(),
                member.getUserId(),
                member.getCafeId(),
                member.getRankId(),
                member.getJoinDate()
        );
    }
}