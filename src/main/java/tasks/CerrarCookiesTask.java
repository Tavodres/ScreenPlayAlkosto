package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.NoSuchElementException;

import static UI.PaginaPrincipalUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CerrarCookiesTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        try{
            boolean visible = BTN_COOKIES.isVisibleFor(actor);
            if(visible){
                actor.attemptsTo(
                Click.on(BTN_COOKIES).afterWaitingUntilPresent()
                );
            }
        }catch (NoSuchElementException ignored){

        }

    }


    public static Performable cerrar(){return instrumented(CerrarCookiesTask.class);}

}
