package ru.t1.java.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;
import ru.t1.java.demo.dto.TransactionForAccept;
import ru.t1.java.demo.dto.TransactionResult;
import ru.t1.java.demo.model.Transaction;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING)
public interface TransactionResultMapper {
    TransactionResult toResultBlocked(Transaction transaction);

    TransactionResult toResult(TransactionForAccept transactionForAccept);
}
