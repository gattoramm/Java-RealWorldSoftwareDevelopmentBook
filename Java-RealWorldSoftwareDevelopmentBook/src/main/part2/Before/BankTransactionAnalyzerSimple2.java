package main.part2.Before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * если файл пустой?...
 * как посчитать сумму из файла, если данные повреждены?...
 * что, если пропущены какие-либо данные?...
 */

public class BankTransactionAnalyzerSimple2 {
    private static final String RESOURCES = "src/main/resources/";

    public static void main(String[] args) throws IOException {
        // сколько транзакций было в конкретном месяце
        final Path path = Paths.get(RESOURCES + "file.csv");
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;
        final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        for (final String line: lines) {
            final String[] columns = line.split(",");
            final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
            if (date.getMonth() == Month.JANUARY) {
                final double amount = Double.parseDouble(columns[1]);
                total += amount;
            }
        }
        System.out.println("The total for all transactions in January is " + total);
    }
}
