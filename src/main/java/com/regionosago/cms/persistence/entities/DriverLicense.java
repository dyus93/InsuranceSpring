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
@Table(name = "tbl_driver_license")
public class DriverLicense extends PersistableEntity {

    @Column(name = "fld_number")
    private String number;

    @Column(name = "fld_date_old")
    private Date getLicense;

    @Column(name = "fld_date_future")
    private Date changeLicense;

}
