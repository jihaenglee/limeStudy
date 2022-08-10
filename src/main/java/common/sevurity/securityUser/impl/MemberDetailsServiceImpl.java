package common.sevurity.securityUser.impl;

import com.lime.member.dto.Member;
import com.lime.member.provider.MemberProvider;
import common.sevurity.securityUser.MemberDetailsService;
import common.sevurity.SecurityUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class MemberDetailsServiceImpl implements MemberDetailsService {



    private static final Logger logger = LogManager.getLogger(MemberDetailsServiceImpl.class);
    @Autowired
    private MemberProvider memberDetailProvider;

    @Autowired
    private SecurityUser securityUser;

    @Override
    public UserDetails loadMemberByUserId(String memberId) throws UsernameNotFoundException {

        logger.debug("=======================security loadUserByUsername START============================");
        logger.debug("=======================UserId : " + memberId);

        Member member = memberDetailProvider.readMember(memberId);



        logger.debug("=======================security loadUserByUsername END==============================");


        return new SecurityUser() {
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
                authorities.add(new SimpleGrantedAuthority(member.getRole()));  // Role을 위해
                return authorities;
            }
            @Override
            public String getPassword() { return member.getPassword(); }
            @Override
            public String getUsername() { return member.getMemberId(); }
            @Override
            public boolean isAccountNonExpired() { return true; }
            @Override
            public boolean isAccountNonLocked() { return true; }
            @Override
            public boolean isCredentialsNonExpired() { return true; }
            @Override
            public boolean isEnabled() { return true; }
        };

    }

}
