package com.lime.member.provider;

import com.lime.member.dto.Member;

public interface MemberProvider {


    Member readMember(String memberId);

}
