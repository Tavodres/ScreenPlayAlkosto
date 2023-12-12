package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;



import static net.serenitybdd.screenplay.Tasks.instrumented;


public class PaginaPrincipalTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.alkosto.com/")
        );
    }


    public static PaginaPrincipalTask abrirNav(){
        return instrumented(PaginaPrincipalTask.class);
    }



}
