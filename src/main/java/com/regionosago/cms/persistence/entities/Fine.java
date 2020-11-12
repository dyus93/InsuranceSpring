package com.regionosago.cms.persistence.entities;

import com.regionosago.cms.persistence.entities.utils.PersistableEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(callSuper = true)
@Table(name = "tbl_fine")
public class Fine extends PersistableEntity {

    @Column(name = "fld_name")
    private String fineName;

    @Column(name = "fld_sum")
    private int sum;

    @Column(name = "fld_date")
    private Date fineDate;
}
