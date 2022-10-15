package re.java;

public class bankAccount {

    String bankName;
    String accountName;
    String accountType;
    int accountNumber;
    double accountBalance;

    // methods

    public String getBankDetails() {
        return "Welcome to " + bankName + "!" + "Name is " + accountName + "-" + accountType +
                "." + "Number is " + accountNumber + "." +
                "Cleared Balance = " + accountBalance + "SEK.";
    }
}
