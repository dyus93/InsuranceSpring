package com.regionosago.cms.persistence.entities;

import com.regionosago.cms.persistence.entities.enums.Role;
import com.regionosago.cms.persistence.entities.utils.PersistableEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_users")
public class User extends PersistableEntity {

    @Column(name = "login_fld")
    private String login;

    @Column(name = "password_fld")
    private String password;

    @Column(name = "role_fld")
    @Enumerated(EnumType.STRING)
    private Role role;
}
