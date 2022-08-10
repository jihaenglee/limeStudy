package com.lime.member.dao;

import com.lime.member.dto.Member;

public interface MemberDao {
    Member readMember(String memberId);
}
