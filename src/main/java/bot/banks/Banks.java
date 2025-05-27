package bot.banks;

import java.io.IOException;
import java.util.List;

public interface Banks {
    String getName();

    List<WorkingCurrency> getCurrencies();

    void updateCurrentData() throws IOException;
}
