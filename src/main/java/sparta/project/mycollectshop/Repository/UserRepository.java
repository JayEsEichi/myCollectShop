package sparta.project.mycollectshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sparta.project.mycollectshop.Entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByKakaoId(Long kakaoId);
}