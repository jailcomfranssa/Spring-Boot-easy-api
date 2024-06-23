package github.com.jailcomfranssa.transaction_api.repository;

import github.com.jailcomfranssa.transaction_api.domain.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}
