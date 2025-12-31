package io.patchfox.turbo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import io.patchfox.db_entities.entities.FindingReporter;


public interface FindingReporterRepository extends JpaRepository<FindingReporter, Long> {}
