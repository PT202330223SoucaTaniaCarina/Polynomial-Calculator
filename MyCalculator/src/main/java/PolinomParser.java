import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PolinomParser {

    private static final Pattern TERM_PATTERN = Pattern.compile("(\\+|-)?(\\d*)(x(\\^(\\d+))?)?");

    public static Map<Integer, Double> parse(String polynomial) {
        Map<Integer, Double> coefficients = new HashMap<>();
        Matcher matcher = TERM_PATTERN.matcher(polynomial);

        while (matcher.find()) {
            String sign = matcher.group(1);
            String coefficient = matcher.group(2);
            String variable = matcher.group(3);
            String exponent = matcher.group(5);

            Double coeff = (coefficient.isEmpty()) ? 1 : Double.parseDouble(coefficient);
            coeff = (sign != null && sign.equals("-")) ? -coeff : coeff;

            int exp = (exponent != null) ? Integer.parseInt(exponent) : 0;

            if (coefficients.containsKey(exp)) {
                coeff += coefficients.get(exp);
            }

            coefficients.put(exp, coeff);
        }

        return coefficients;
    }
}
