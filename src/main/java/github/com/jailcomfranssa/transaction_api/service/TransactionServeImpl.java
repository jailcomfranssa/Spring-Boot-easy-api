package github.com.jailcomfranssa.transaction_api.service;

import github.com.jailcomfranssa.transaction_api.domain.dto.TransactionDTO;
import github.com.jailcomfranssa.transaction_api.domain.entities.Transaction;
import github.com.jailcomfranssa.transaction_api.repository.TransactionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TransactionServeImpl implements TransactionService{

    private final TransactionRepository transactionRepository;

    public TransactionServeImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction save(TransactionDTO transactionDTO) {
        Transaction transaction = new Transaction();
        TransactionDTO dto = new TransactionDTO.Builder()
                .total(transactionDTO.getTotal())
                        .createdAt(LocalDateTime.now())
                .cardNumber(transactionDTO.getCardNumber())
                .ccv(transactionDTO.getCcv())
                .owner(transactionDTO.getOwner())
                .ein(transactionDTO.getEin())
                .build();

        BeanUtils.copyProperties(transactionDTO, transaction);
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> findAll() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction findById(UUID id) {
        return transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));
    }

    @Override
    public Transaction update(UUID id, TransactionDTO transactionDTO) {
        Optional<Transaction> transactionOptional = transactionRepository.findById(id);
        if (!transactionOptional.isEmpty()) {
            throw new RuntimeException("Transaction not found");
        }
        Transaction transaction = transactionOptional.get();
        BeanUtils.copyProperties(transactionDTO, transaction, "id");
        return transactionRepository.save(transaction);
    }

    @Override
    public void delete(UUID id) {
        Optional<Transaction> transactionOptional = transactionRepository.findById(id);
        if (!transactionOptional.isEmpty()) {
            throw new RuntimeException("Transaction not found");
        }
        transactionRepository.deleteById(id);

    }
}



























