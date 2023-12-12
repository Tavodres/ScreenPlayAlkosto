package tasks;

import interactions.ObtenerNombreProducto;
import interactions.SeleccionAleatoria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static UI.PopUpConfirmacion.BTN_CERRARPOP;
import static UI.ProductosUI.BTN_CARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarAgregarTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        String Pr;
        actor.attemptsTo(

                SeleccionAleatoria.click(),
                //ObtenerNombreProducto.nombreProducto("producto1"),
                Click.on(BTN_CARRITO),
                Click.on(BTN_CERRARPOP)

        );

    }


    public static SeleccionarAgregarTask seleccionarAgregar(){
        return instrumented(SeleccionarAgregarTask.class);
    }

}
