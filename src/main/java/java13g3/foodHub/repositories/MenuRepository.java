package java13g3.foodHub.repositories;

import java13g3.foodHub.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
