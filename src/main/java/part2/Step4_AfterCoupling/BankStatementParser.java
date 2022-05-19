package part2.Step4_AfterCoupling;

import java.util.List;

// интерфейс для парсинга банковских операций
public interface BankStatementParser {
    BankTransaction parseFrom(String line);
    List<BankTransaction> parseLinesFrom(List<String> lines);
}
