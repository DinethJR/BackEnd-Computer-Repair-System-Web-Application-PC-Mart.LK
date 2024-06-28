package net.javaguides.computerrepairsystem.repository;

import net.javaguides.computerrepairsystem.entity.RepairRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairRequestRepository extends JpaRepository<RepairRequest, Long> {
}
