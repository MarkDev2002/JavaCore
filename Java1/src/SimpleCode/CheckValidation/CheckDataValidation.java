package SimpleCode.CheckValidation;

public class CheckDataValidation {
    public boolean isEmail(String str)
    {
        String pattern = "\\w+@\\w+(\\.\\w+){1,2}";
        return str.matches(pattern);
    }

    public boolean isPhoneNumber(String str)
    {
        String pattern = "0\\d{8}";
        return str.matches(pattern);
    }

    public boolean isCMND(String str)
    {
        String pattern = "\\d{10}";
        return str.matches(pattern);
    }
}
