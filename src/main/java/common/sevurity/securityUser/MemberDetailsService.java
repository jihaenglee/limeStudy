package common.sevurity.securityUser;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface MemberDetailsService {
    public UserDetails loadMemberByUserId(String UserId) throws UsernameNotFoundException;
}
