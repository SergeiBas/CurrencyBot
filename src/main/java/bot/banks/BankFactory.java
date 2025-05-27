package bot.banks;

import bot.banks.monobank.MonoBankService;
import bot.banks.nbubank.NBUBankService;
import bot.banks.privatbank.PrivatBankService;

public class BankFactory {

    private BankFactory() {
    }

    public static Banks getBank(String bankName) {
        if (bankName.equals("PrivatBank")) {
            return new PrivatBankService();
        } else if (bankName.equals("MonoBank")) {
            return new MonoBankService();
        }

        return new NBUBankService();
    }
}
