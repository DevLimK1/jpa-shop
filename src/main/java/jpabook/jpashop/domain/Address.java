package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    //기본 생성자 생성 이유 : JPA 구현 라이브러리가 객체 생성할 때 리플랙션 같은 기술을 사용할 수 있도록
    //지원해야하기 때문
    protected Address() { //사람들이 호출할 수 있기 때문에 JPA spec에서는 protected까지 허용
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
