package com.briup.student.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel
public class Student implements Serializable {
  @ApiModelProperty(value = "学号" ,required = true)
  private int id;
  @ApiModelProperty(value = "姓名")
  private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
