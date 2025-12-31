package io.patchfox.turbo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import io.patchfox.db_entities.entities.Package;

public interface PackageRepository extends JpaRepository<Package, Long> {}
