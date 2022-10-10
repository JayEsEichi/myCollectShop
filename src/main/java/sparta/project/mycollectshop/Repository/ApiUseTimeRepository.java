package sparta.project.mycollectshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sparta.project.mycollectshop.Entity.ApiUseTime;
import sparta.project.mycollectshop.Entity.User;

import java.util.Optional;

public interface ApiUseTimeRepository extends JpaRepository<ApiUseTime, Long> {
    Optional<ApiUseTime> findByUser(User user);
}