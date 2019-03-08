package nl.tue.base.ruleengineservicedto.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RuleDto {

    private String message;
    private boolean isValid;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }
}
