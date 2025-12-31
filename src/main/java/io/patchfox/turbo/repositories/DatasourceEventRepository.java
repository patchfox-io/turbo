package io.patchfox.turbo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import io.patchfox.db_entities.entities.DatasourceEvent;

public interface DatasourceEventRepository extends JpaRepository<DatasourceEvent, Long> {}
