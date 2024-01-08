package hello.hellospring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id; // 시스템이 저장하는 id
  private String name; // 실제 사용자가 입력하는 이름

  // getter, setter
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  // getter, setter
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
