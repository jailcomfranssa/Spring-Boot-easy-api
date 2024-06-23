package github.com.jailcomfranssa.transaction_api.service;

import github.com.jailcomfranssa.transaction_api.domain.dto.TransactionDTO;
import github.com.jailcomfranssa.transaction_api.domain.entities.Transaction;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


public interface TransactionService {

    Transaction save(TransactionDTO transactionDTO);

    List<Transaction> findAll();

    Transaction findById(UUID id);

    Transaction update(UUID id, TransactionDTO transactionDTO);

    void delete(UUID id);
}






















