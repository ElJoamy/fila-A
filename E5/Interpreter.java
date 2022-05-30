package E5;

import java.util.ArrayList;
import java.util.List;

public class Interpreter {
    private List<AbstractExpression> grammar =new ArrayList<>();
    private Context context;

    public Interpreter(String msgToInterpret) {
        context = new Context(msgToInterpret.replace(" ", ""));
        for (String charOriginal : msgToInterpret.split(" ")) {
            switch (charOriginal){
                case "*":
                    grammar.add(new Multiplicacion(context.signo));
                    break;
                case "+":
                    grammar.add(new Suma(context.signo));
                    break;
                default:
                    grammar.add(new Numero(context.signo));
                    break;
            }
        }
    }

    public int evaluateMsg(){
        for (AbstractExpression expression:grammar) {
            expression.interpreter(context);
        }
        return context.output;
    }
}
