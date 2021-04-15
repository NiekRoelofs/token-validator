package nl.niekroelofs.security.repository;

import nl.niekroelofs.security.models.ERole;
import nl.niekroelofs.security.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
