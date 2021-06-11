package com.br.ayrton.course.entities.pk;

import com.br.ayrton.course.entities.Order;
import com.br.ayrton.course.entities.Product;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderItemPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "order_id")
    @Getter @Setter private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @Getter  @Setter private Product product;


}
