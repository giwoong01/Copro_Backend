package com.example.copro.member.mypage.api.dto.response;

import com.example.copro.member.domain.Member;
import lombok.Builder;

@Builder
public record MyProfileInfoResDto(
        String name,
        String picture,
        String occupation,
        String language,
        String career,
        String gitHubUrl,
        String nickName,
        int viewType,
        int likeMembersCount
) {
    public static MyProfileInfoResDto myProfileInfoOf(Member member, int likeMembersCount) {
        return MyProfileInfoResDto.builder()
                .name(member.getName())
                .picture(member.getPicture())
                .occupation(member.getOccupation())
                .language(member.getLanguage())
                .career(member.getCareer())
                .gitHubUrl(member.getGitHubUrl())
                .nickName(member.getNickName())
                .viewType(member.getViewType())
                .likeMembersCount(likeMembersCount)
                .build();
    }
}