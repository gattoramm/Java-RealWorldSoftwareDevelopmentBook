import org.junit.Assert;
import org.junit.Test;
import p02.step4.BankStatementCSVParser;
import p02.step4.BankStatementParser;
import p02.step4.BankTransaction;
import java.time.LocalDate;
import java.time.Month;


public class BankStatementCSVParserTest {
    private final BankStatementParser statementParser = new BankStatementCSVParser();

    @Test
    public void shouldParseOneCorrectLine() throws Exception {
        final String line = "30-01-2017,-50,Tesco";

        final BankTransaction result = statementParser.parseFrom(line);

        final BankTransaction excepted;
        excepted = new BankTransaction(LocalDate.of(2017, Month.JANUARY, 30), -50, "Tesco");
        final double tolerance = 0.0d;

        Assert.assertEquals(excepted.getDate(), result.getDate());
        Assert.assertEquals(excepted.getAmount(), result.getAmount(), tolerance);
        Assert.assertEquals(excepted.getDescription(), result.getDescription());
    }
}
