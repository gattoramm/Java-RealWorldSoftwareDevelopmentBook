package part3.Step1_AddNewMethods;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class BankStatementProcessor {
    private final List<BankTransaction> bankTransactions;

    public BankStatementProcessor(final List<BankTransaction> bankTransactions) {
        this.bankTransactions = bankTransactions;
    }
    public double calculateTotalAmount() {
        double total = 0d;
        for (final BankTransaction bankTransaction: bankTransactions)
            total += bankTransaction.getAmount();
        return total;
    }

    public double calculateTotalInMonth(final Month month) {
        double total = 0d;
        for (final BankTransaction bankTransaction: bankTransactions)
            if (bankTransaction.getDate().getMonth() == month)
                total += bankTransaction.getAmount();
        return total;
    }

    public double calculateTotalForCategory(final String category) {
        double total = 0d;
        for (final BankTransaction bankTransaction: bankTransactions)
            if (bankTransaction.getDescription().equals(category))
                total += bankTransaction.getAmount();
        return total;
    }

    // Поиск транзакций на сумму больше заданной
    public List<BankTransaction> findTransactionsGreaterThanEqual(final int amount) {
        final List<BankTransaction> result = new ArrayList<>();
        for(final BankTransaction bankTransaction: bankTransactions)
            if(bankTransaction.getAmount() >= amount)
                result.add(bankTransaction);
        return result;
    }

    // Поиск транзакций в определенном месяце
    public List<BankTransaction> findTransactionsInMonth(final Month month) {
        final List<BankTransaction> result = new ArrayList<>();
        for(final BankTransaction bankTransaction: bankTransactions)
            if(bankTransaction.getDate().getMonth() == month)
                result.add(bankTransaction);
        return result;
    }

    // Поиск транзакций на сумму больше заданной и в определенном месяце
    public List<BankTransaction> findTransactionsInMonthAndGreaterThanEqual(final Month month, final int amount) {
        final List<BankTransaction> result = new ArrayList<>();
        for(final BankTransaction bankTransaction: bankTransactions)
            if(bankTransaction.getDate().getMonth() == month && bankTransaction.getAmount() >= amount)
                result.add(bankTransaction);
        return result;
    }
}
