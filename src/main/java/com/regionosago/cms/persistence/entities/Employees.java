package com.regionosago.cms.persistence.entities;

import com.regionosago.cms.persistence.entities.utils.PersistableEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_employees")
public class Employees extends PersistableEntity {

    @Column(name = "fld_surname")
    private String surname;

    @Column(name = "fld_name")
    private String name;

    @Column(name = "fld_patronymic")
    private String patronymic;

    @Column(name = "fld_date")
    private Date getJob;

    @Column(name = "fld_post")
    private String post;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "fld_passport_id")
    private Passport passport;
}
