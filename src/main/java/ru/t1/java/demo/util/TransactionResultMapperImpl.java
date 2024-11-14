package ru.t1.java.demo.util;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.t1.java.demo.dto.TransactionForAccept;
import ru.t1.java.demo.dto.TransactionResult;
import ru.t1.java.demo.mapper.TransactionResultMapper;
import ru.t1.java.demo.model.Transaction;

import static ru.t1.java.demo.model.enums.TransactionStatusEnum.BLOCKED;

@Component
@RequiredArgsConstructor
public class TransactionResultMapperImpl implements TransactionResultMapper {
    @Override
    public TransactionResult toResultBlocked(Transaction transaction) {
        return TransactionResult.builder()
                .accountId(transaction.getAccount().getId())
                .transactionId(transaction.getId())
                .transactionStatus(BLOCKED)
                .build();
    }

    @Override
    public TransactionResult toResult(TransactionForAccept transactionForAccept) {
        return TransactionResult.builder()
                .accountId(transactionForAccept.getAccountId())
                .transactionId(transactionForAccept.getTransactionId())
                .build();
    }
}
