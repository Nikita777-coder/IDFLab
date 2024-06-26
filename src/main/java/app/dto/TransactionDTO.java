package app.dto;

import app.dto.limit.MonthLimitResponse;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class TransactionDTO {
    private String currency;
    private BigDecimal amount;
    private LocalDateTime timeOperation;
    private MonthLimitResponse limit;
}
