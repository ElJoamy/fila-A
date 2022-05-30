package E5;

public class Multiplicacion extends AbstractExpression {
    public Multiplicacion(int digit) {
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("*")){
            context.signo = 3;
            context.input = context.input.substring(this.digit);
        }
    }
}
