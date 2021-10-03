package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ResponseList<T> extends ResponseBase implements Serializable{
	 @JsonIgnore
	  private static final long serialVersionUID = 470266841345782890L;
	  private List<T> data;

	  public List<T> getData() {
	    return data;
	  }

	  public void setData(List<T> data) {
	    this.data = data;
	  }
}
