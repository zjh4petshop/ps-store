package com.zjh.psstore.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Data
public class BaseEntity {

  @Id private String id;
  @CreatedBy private String createdBy;
  @LastModifiedBy private String modifiedBy;
  @CreatedDate private Date createdDate;
  @LastModifiedDate private Date modifiedDate;
}
