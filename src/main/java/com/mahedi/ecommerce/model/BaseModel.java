package com.mahedi.ecommerce.model;

import com.mahedi.ecommerce.enums.ActiveStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

    private Integer activeStatus;

    @PrePersist
    public void setPreInsertData(){
        this.createAt=new Date();
//        if(this.activeStatus == null){
//            this.activeStatus= ActiveStatus.ACTIVE.getValue();
//        }
    }

    @PreUpdate
    public void setPreUpdateData(){
        this.updateAt=new Date();
    }
}
