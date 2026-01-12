package gr.aueb.cf.cf9.ch18.bankapp.validation;

import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountDepositDTO;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountWithdrawDTO;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Validator {

    private Validator(){

    }

    public static Map<String, String> validateInsertDTO(AccountInsertDTO dto) {
        Map<String, String> errors = new HashMap<>();

        if (dto.iban() == null || !dto.iban().trim().matches("GR\\d{3,25}")) {
            errors.put("iban", "IBAN must start with GR and must have 3-25 digits.");
        }

        if (dto.balance() == null || dto.balance().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("balance", "Balance must be greater than zero.");
        }

        return errors;

    }

    public static Map<String, String> validateDepositDTO(AccountDepositDTO dto) {
        Map<String, String> errors = new HashMap<>();

        if (dto.iban() == null || !dto.iban().trim().matches("GR\\d{3,25}")) {
            errors.put("iban", "IBAN must start with GR and must have 3-25 digits.");
        }

        if (dto.amount() == null || dto.amount().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("amount", "Deposit amount must be greater than zero.");
        }

        return errors;


    }


    public static Map<String, String> validateWithdrawDTO(AccountWithdrawDTO dto) {
        Map<String, String> errors = new HashMap<>();

        if (dto.iban() == null || !dto.iban().trim().matches("GR\\d{3,25}")) {
            errors.put("iban", "IBAN must start with GR and must have 3-25 digits.");
        }

        if (dto.amount() == null || dto.amount().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("amount", "Deposit amount must be greater than zero.");
        }

        return errors;
    }


    public static Map<String, String> validdateIban(String iban){

        Map<String, String> errors = new HashMap<>();

        if (iban == null || !iban.trim().matches("GR\\d{3,25}")) {
            errors.put("iban", "IBAN must start with GR and must have 3-25 digits.");
        }

        return errors;
    }

}
