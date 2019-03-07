package ir.itsurena.base.ruleengineservicedto.util;

public enum RuleErrorCode {
    ACCOUNT_LOW_BALANCE("ACCOUNT_LOW_BALANCE"),
    ACCOUNT_HIGH_BALANCE("ACCOUNT_HIGH_BALANCE");
    private final String text ;

    RuleErrorCode(final String text) {
        this.text = text;
    }
    @Override
    public String toString() {
        return text;
    }
}
