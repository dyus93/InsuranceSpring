package com.regionosago.cms.persistence.entities;

import com.regionosago.cms.persistence.entities.utils.PersistableEntity;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_clients")
public class Clients extends PersistableEntity {

    @Column(name = "fld_surname")
    private String surname;

    @Column(name = "fld_name")
    private String name;

    @Column(name = "fld_patronymic")
    private String patronymic;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "fld_passport_id")
    private Passport passport;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "fld_license_id")
    private DriverLicense license;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "fld_cars_id")
    private Cars car;
}
