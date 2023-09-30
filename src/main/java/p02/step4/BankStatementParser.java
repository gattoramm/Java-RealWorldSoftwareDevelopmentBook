package p02.step4;

import java.util.List;


// интерфейс для парсинга банковских операций
public interface BankStatementParser {
    BankTransaction parseFrom(String line);
    List<BankTransaction> parseLinesFrom(List<String> lines);
}
