package io.patchfox.turbo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import io.patchfox.db_entities.entities.DatasetMetrics;

public interface DatasetMetricsRepository extends JpaRepository<DatasetMetrics, Long> {}
