package com.mahedi.ecommerce.enums;

public enum AvailableStatus {
  AVAILABLE(0),
  OUT_OF_STOCK(1);

  public final int value;

  AvailableStatus(int value){
    this.value=value;
  }

  public int getValue(){
    return value;
  }

}
