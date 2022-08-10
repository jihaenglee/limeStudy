package com.lime.member.provider.impl;

import com.lime.member.dao.MemberDao;
import com.lime.member.dto.Member;
import com.lime.member.provider.MemberProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MemberProviderImpl implements MemberProvider {


    @Autowired
    private MemberDao memberDao;

    @Override
    public Member readMember(String memberId) {
        return memberDao.readMember(memberId);
    }

}
