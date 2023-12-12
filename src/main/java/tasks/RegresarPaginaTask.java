package tasks;

import interactions.DevolverPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegresarPaginaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                DevolverPagina.devolver()
        );
    }

    public static RegresarPaginaTask regresarPag(){
        return instrumented(RegresarPaginaTask.class);
    }

}
