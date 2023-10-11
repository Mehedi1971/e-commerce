package com.mahedi.ecommerce.model;

import com.mahedi.ecommerce.enums.AvailableStatus;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
  public void setPreInsertData() {
    this.createAt = new Date();
//        if(this.activeStatus == null){
//            this.activeStatus= ActiveStatus.ACTIVE.getValue();
//        }
    }

  @PreUpdate
  public void setPreUpdateData() {
    this.updateAt = new Date();
  }
}
