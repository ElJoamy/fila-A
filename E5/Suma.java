package E5;

public class Suma extends AbstractExpression{
    public Suma(int digit){
        this.digit = digit;
    }

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("+")){
            context.signo = 1;
            context.input = context.input.substring(this.digit);
        }
    }
    
}
