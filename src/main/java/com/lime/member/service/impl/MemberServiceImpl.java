package com.lime.member.service.impl;

import com.lime.member.dto.Member;
import com.lime.member.service.MemberService;
import org.apache.logging.log4j.message.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

public class MemberServiceImpl implements MemberService {

//    //회원가입
//    @Transactional
//    @Override
//    public ResponseEntity<Message> createUser(Member member) {
//        if (!"".equals(member.getMemberId())) {
//
//            // 소셜 로그인 패스워드 만들기
//            if (member.getSocial() != null && member.getgetSocial) {
//                PasswordUtil pw = new PasswordUtil();
//                String newPw = pw.encryptSHA256(request.getId());
//                request.setPassword(newPw);
//            }
//
//            String encodePassword = passwordEncoder.encode(member.getPassword()); // 이곳
//            member.setPassword(encodePassword);
//
//            userDao.createUser(member);
//
//            headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
//            message.setStatus(StatusEnum.OK);
//            message.setMessage(ResponseMessage.CREATED_USER);
//            message.setData(member);
//
//            return new ResponseEntity <> (message, headers, HttpStatus.OK);
//        } else {
//            message.setStatus(StatusEnum.BAD_REQUEST);
//            message.setMessage(ResponseMessage.ALREADY_USE);
//            return new ResponseEntity <> (message, headers, HttpStatus.NOT_FOUND);
//        }
//    }
//
}
