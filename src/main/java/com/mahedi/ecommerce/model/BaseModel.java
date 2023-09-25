package com.mahedi.ecommerce.model;

import com.mahedi.ecommerce.enums.ActiveStatus;
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
  private Long id;
  private int activeStatus;
  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt;
  @Temporal(TemporalType.TIMESTAMP)
  private Date updatedAt;

  @PrePersist
  public void setPerInsertData() {
    this.createdAt = new Date();
//    if(this.activeStatus==null){
//      this.activeStatus= ActiveStatus.ACTIVE.getValue();
//    }
  }

  @PreUpdate
  public void setPreUpdateData(){
    this.updatedAt=new Date();

  }

}




