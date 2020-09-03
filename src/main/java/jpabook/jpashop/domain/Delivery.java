package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Delivery {

    @Id @GeneratedValue
    @Column(name="delivery_id")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING) //ORDINAL 하면 READY, COMP가 숫자로 매핑되기 때문에 사이에 다른 값이 들어가면 숫자 값이 변경된다.
    private DeliberyStatus status; //READY, COMP
}
