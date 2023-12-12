package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import utils.Data;


import static UI.PaginaPrincipalUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

         actor.attemptsTo(

                Click.on(TXT_BUSCAR),
                Enter.theValue(Data.extractTo().get(0).get("Producto")).into(TXT_BUSCAR).thenHit(Keys.ENTER)

        );

    }


    public static BuscarTask buscar(){
        return instrumented(BuscarTask.class);
    }

}
