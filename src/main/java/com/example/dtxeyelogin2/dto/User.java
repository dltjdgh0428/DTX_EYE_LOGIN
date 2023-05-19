package com.example.dtxeyelogin2.dto;

import com.example.dtxeyelogin2.dto.eums.Role;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


/**
 * "app_user" 테이블과 매핑되도록 지정합니다.
 */
@Entity(name = "app_user")
@Table(name = "app_user")
@NoArgsConstructor
@Getter
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "name", nullable = false)
    private String name;

//    @Column(name = "password", nullable = false)
//    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @Builder
    public User(int id, String email, String name, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
//        this.password = password;
        this.role = role;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    /**
     *  사용자 정보를 업데이트할 때 사용하는 메소드입니다.
     */
    public User update(String name) {
        this.name = name;
        return this;
    }

    /**
     *  사용자 권한의 key 값을 반환합니다.
     */
    public String getRoleKey() {
        return this.role.getKey();
    }
}