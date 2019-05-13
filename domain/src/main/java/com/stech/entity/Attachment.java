package com.stech.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Attachment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    private String name;

    private long size;

    private String fileType;

    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    protected Date created;

    @ManyToOne(fetch = FetchType.LAZY)
    private User uploadedBy;

    private boolean publicResource;

    @Lob
    private byte[] fileData;

    @Version
    protected long version;

    @PrePersist
    public void prePersist() {
        this.created = new Date();
    }

    public Attachment(@NotBlank String name, long size, String fileType, String description,
    		User uploadedBy, boolean publicResource, byte[] data) {
        this.name = name;
        this.size = size;
        this.fileType = fileType;
        this.description = description;
        this.uploadedBy = uploadedBy;
        this.publicResource = publicResource;
        this.fileData = data;
    }
}