package com.example.member.global.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "CAFE_MEMBERS"
//        ,indexes = {@Index(columnList = "MEMBER_ID")}
)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;
    @Column(name = "PROFILE_IMAGE")
    @Setter
    private String profileImage;
    @Column(name = "NICKNAME")
    @Setter
    private String nickname;
    @Column(name = "ABOUT_ME")
    @Setter
    private String aboutMe;
    @Column(name = "AGE_VISIBILITY_OPTION")
    @Setter
    private Boolean ageVisibilityOption;
    @Column(name = "JOIN_ANSWER")
    @Setter
    private String joinAnswer;
    @Column(name = "MEMBER_STATUS")
    private Boolean memberStatus;
    @Column(name = "JOIN_DATE")
    private LocalDateTime joinDate;
}