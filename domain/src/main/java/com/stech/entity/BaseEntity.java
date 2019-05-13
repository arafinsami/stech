package com.stech.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    protected Date created;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date lastUpdated;

    @ManyToOne(fetch = FetchType.LAZY)
    private User createdBy;

    @ManyToOne(fetch = FetchType.LAZY)
    private User updatedBy;

    @Version
    protected long version;

    @PrePersist
    public void prePersist() {
        this.created = new Date();
        this.lastUpdated = new Date();
    }

    @PreUpdate
    public void preUpdate() {
        this.lastUpdated = new Date();
    }
}
