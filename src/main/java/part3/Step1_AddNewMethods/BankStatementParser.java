package part3.Step1_AddNewMethods;

import java.util.List;


public interface BankStatementParser {
    BankTransaction parseFrom(String line);
    List<BankTransaction> parseLinesFrom(List<String> lines);
}
