package com.lime.member.dao.impl;

import com.lime.member.dao.MemberDao;
import com.lime.member.dto.Member;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberDaoImpl implements MemberDao {

    @Autowired
    private SqlSession session;

    @Override
    public Member readMember(String memberId) {
        return session.selectOne("member.readMember",memberId);
    }
}
