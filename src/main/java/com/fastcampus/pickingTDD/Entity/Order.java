package com.fastcampus.pickingTDD.Entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Order {
  private Long orderId;
  private OrderStateEnum state;
  private List<OrderDetail> orderDetailList;
}
