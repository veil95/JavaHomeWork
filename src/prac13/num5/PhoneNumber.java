package prac13.num5;

public class PhoneNumber {
    private String formattedNumber;
    public PhoneNumber(String rawNumber) {
        this.formattedNumber = formatNumber(rawNumber);
    }
    private String formatNumber(String rawNumber) {
        if (rawNumber.startsWith("+")) {
            String countryCode = rawNumber.substring(1, rawNumber.length() - 10);
            String localNumber = rawNumber.substring(rawNumber.length() - 10);
            return "+" + countryCode + formatLocalNumber(localNumber);
        } else if (rawNumber.startsWith("8") && rawNumber.length() == 11) {
            String countryCode = "7";
            String localNumber = rawNumber.substring(1);
            return "+" + countryCode + formatLocalNumber(localNumber);
        } else {
            throw new IllegalArgumentException("Неверный формат номера: " + rawNumber);
        }
    }
    private String formatLocalNumber(String localNumber) {
        return localNumber.substring(0, 3) + "-" +
                localNumber.substring(3, 6) + "-" +
                localNumber.substring(6);
    }

    public String getFormattedNumber() {
        return formattedNumber;
    }

    @Override
    public String toString() {
        return formattedNumber;
    }
}
