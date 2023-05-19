package com.example.dtxeyelogin2.dto;

import com.example.dtxeyelogin2.dto.eums.Role;
import lombok.Getter;
import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private Role role;

    /**
     * 이 생성자는 User 객체에서 이름과 이메일 정보를 가져와서 SessionUser 객체에 저장합니다.
     */
    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.role = user.getRole();
    }
}
