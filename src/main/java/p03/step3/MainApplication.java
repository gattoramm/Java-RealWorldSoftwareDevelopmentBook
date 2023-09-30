package p03.step3;

import java.io.IOException;


public class MainApplication {
    public static void main(String[] args) throws IOException {
        final String fileName = "file.csv";

        final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();

        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        bankStatementAnalyzer.analyze(fileName, bankStatementParser);
    }
}
