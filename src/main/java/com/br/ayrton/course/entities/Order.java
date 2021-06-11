package com.br.ayrton.course.entities;

import com.br.ayrton.course.entities.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@ToString
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    @Getter  @Setter private Instant moment;

    private Integer orderStatus;

    @ManyToOne
    @JoinColumn(name = "client_id")
    @Getter  @Setter private User client;

//    @ManyToMany
//    @JoinTable(name = "tb_product_order",
//            joinColumns = @JoinColumn(name = "product_id"),
//            inverseJoinColumns = @JoinColumn(name = "order_id"))
//    @Getter private Set<Product> products = new HashSet<>();

    @OneToMany (mappedBy = "id.order")
    @Fetch(FetchMode.JOIN)
    @Getter private Set<OrderItem> items = new HashSet<>();

    public Order(Long id, Instant moment, OrderStatus orderStatus, User client) {
        this.id = id;
        this.moment = moment;
        setOrderStatus(orderStatus);
        this.client = client;
    }

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        if (orderStatus!=null){
            this.orderStatus = orderStatus.getCode();
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id.equals(order.id) && moment.equals(order.moment) && orderStatus.equals(order.orderStatus) && client.equals(order.client) && items.equals(order.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, moment, orderStatus, client, items);
    }
}
