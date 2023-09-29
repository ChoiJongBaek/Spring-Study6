package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
//JPA가 사용하는 객체에 대한 선언이다.
@Entity
//테이블명과 객체를 서로 매핑시켜준다
//테이블명과 객체명이 같으면 Table 어노테이션을 생략해 줘도 된다.
//@Table(name = "item")
public class Item {

    //Id 어노테이션을 통해 테이블의 PK와 해당 필드를 매핑시킨다.
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //데이터베이스 내에 item_name 컬럼과 Item 객체의 itemName 필드가 서로 매핑되도록 설정
    //테이블 컬럼과 필드명 같으면 설정해주지 않아도 된다.
    @Column(name = "item_name", length = 10)
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
