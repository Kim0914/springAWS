package org.example.springboot.config.auth.dto;

import lombok.Getter;
import org.example.springboot.domain.user.User;

import java.io.Serializable;

/* User 클래스를 직렬화하지 않고 SessionUser 클래스를 따로 직렬화 클래스로 두는 이유는
    User 클래스가 엔티티이기 때문이다. 엔티티 클래스가 언제 다른 엔티티와 연관관계를 맺을지 모른다.
    만약 연관관계를 형성해 자식 엔티티를 가지게 된다면, 자식 엔티티까지 모두 직렬화가 되므로 성능 이슈가 생길 수 있다.
    그러므로 직렬화 기능을 가진 세션 Dto 를 하나 만드는 것이 좋다.
 */

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
