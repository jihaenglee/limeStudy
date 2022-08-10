package com.lime.member.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Alias("member")
@Getter
@Setter
@ToString
public class Member {
    private String memberId;          //아이디
    private String password;        //비밀번호
    private String address;         //주소
    private String birthDay;        //생년월일
    private String phoneNumber;     //전화번호
    private String level;           //등급
    private String signUpDate;      //가입일시
    private String role;
}
