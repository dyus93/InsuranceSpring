package com.regionosago.cms.persistence.entities;

import com.regionosago.cms.persistence.entities.utils.PersistableEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_passport")
public class Passport extends PersistableEntity {

    @Column(name = "fld_serial")
    private int serial;

    @Column(name = "fld_number")
    private int number;

    @Column(name = "fld_date")
    private Date dateBirth;

    @Column(name = "fld_date_give")
    private Date getPassport;

    @Column(name = "fld_code")
    private int code;

    @Column(name = "fld_give")
    private String orgGave;

    @Column(name = "fld_registration")
    private String registration;

}
