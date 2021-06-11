package com.br.ayrton.course.entities;

import com.br.ayrton.course.entities.pk.OrderItemPK;
import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "tb_order_item")
public class OrdemItem implements Serializable {
    @EmbeddedId
    private OrderItemPK id;

    @Getter @Setter private Integer quantity;
    @Getter @Setter private Double price;

    public OrdemItem(Order order, Product product, Integer quantity, Double price) {
        id.setOrder(order);
        id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

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
}
