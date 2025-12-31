package io.patchfox.turbo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import io.patchfox.db_entities.entities.Datasource;

public interface DatasourceRepository extends JpaRepository<Datasource, Long> {}
