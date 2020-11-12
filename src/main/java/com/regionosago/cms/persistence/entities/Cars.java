package com.regionosago.cms.persistence.entities;


import com.regionosago.cms.persistence.entities.enums.CarStatus;
import com.regionosago.cms.persistence.entities.utils.PersistableEntity;

import lombok.*;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_cars")
public class Cars extends PersistableEntity {

    @Column(name = "fld_model")
    private String model;

    @Column(name = "fld_serial")
    private String serial;

    @Column(name = "fld_year")
    private int carYear;

    @Column(name = "fld_number")
    private String number;

    @Column(name = "fld_vincode")
    private String vinCode;

    @Enumerated
    private CarStatus status;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "fld_to_id")
    private TO to;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "fld_clients_id")
    private Clients client;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "fld_fine_id")
    private Fine fine;

    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "fld_image_id")
    private Image image;
}
