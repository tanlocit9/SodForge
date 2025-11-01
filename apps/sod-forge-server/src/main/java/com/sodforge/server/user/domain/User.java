package com.sodforge.server.user.domain;

import com.sodforge.server.common.models.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User extends BaseEntity {

    @Column(unique = true)
    private String email;

    @Column
    private String password;

    @Column
    private String username;

    @Column
    private String displayName;

    @Column
    private String phoneNumber;

    @Column(length = 2)
    private String phoneNumberCode;
}
