package com.regionosago.cms.persistence.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum CarStatus {
    AVAILABLE("Доступна"),
    NOT_AVAILABLE("Не доступна"),
    ON_TO("На ТО"),
    CRASH("В ремонте");

    @Getter
    private String name;
}
