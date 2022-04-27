package com.ead.eadnotificationhex.adapters.dtos;

import com.ead.eadnotificationhex.core.domain.NotificationStatus;

import javax.validation.constraints.NotNull;

public class NotificationDTO {

    @NotNull
    private NotificationStatus status;

    public NotificationStatus getStatus() {
        return status;
    }

    public void setStatus(NotificationStatus status) {
        this.status = status;
    }
}
