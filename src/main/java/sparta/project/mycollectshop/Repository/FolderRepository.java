package sparta.project.mycollectshop.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import sparta.project.mycollectshop.Entity.Folder;
import sparta.project.mycollectshop.Entity.User;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUser(User user);
    List<Folder> findAllByUserAndNameIn(User user, List<String> names);
}