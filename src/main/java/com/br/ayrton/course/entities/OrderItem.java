package com.br.ayrton.course.entities;

import com.br.ayrton.course.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@EqualsAndHashCode
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    @EmbeddedId
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private OrderItemPK id = new OrderItemPK();

    @Getter @Setter private Integer quantity;
    @Getter @Setter private Double price;

    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    @JsonIgnore
    public Order getOrder(){
        return id.getOrder();
    }

    public void setOrder(Order order){
        id.setOrder(order);
    }

    public Product getProduct(){
        return id.getProduct();
    }

    public void setProduct(Product product){
        id.setProduct(product);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        OrderItem orderItem = (OrderItem) o;
//        return id.equals(orderItem.id);
//    }
//
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
}
