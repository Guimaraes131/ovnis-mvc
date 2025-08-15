package io.github.Guimaraes131.ovni;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OvniRepository extends JpaRepository<Ovni, UUID> {
}
