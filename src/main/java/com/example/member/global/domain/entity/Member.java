package com.example.member.global.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CAFE_MEMBERS"
//        ,indexes = {@Index(columnList = "USER_NAME")}
)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;
    @Column(name = "PROFILE_IMAGE")
    private String profileImage;
    @Column(name = "NICKNAME")
    private String nickname;
    @Column(name = "AGE_VISIBILITY_OPTION")
    private Boolean ageVisibilityOption;
    @Column(name = "JOIN_ANSWER")
    private String joinAnswer;
    @Column(name = "MEMBER_STATUS")
    private Boolean memberStatus;
}
