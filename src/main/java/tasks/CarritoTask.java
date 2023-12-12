package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static UI.ProductosUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CarritoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BTN_IRCARRITO)

        );
    }

    public static CarritoTask irCarrito(){
        return instrumented(CarritoTask.class);
    }


}
