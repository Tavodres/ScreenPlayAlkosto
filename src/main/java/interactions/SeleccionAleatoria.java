package interactions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;


import java.util.Random;

import static UI.ProductosUI.LBL_PRODUCTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class SeleccionAleatoria implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        ListOfWebElementFacades listaProductos = LBL_PRODUCTOS.resolveAllFor(actor);

        Random random = new Random();
        int indiceAleatorio= random.nextInt(listaProductos.size());
        listaProductos.get(indiceAleatorio).click();

    }


    public static Performable click(){
        return instrumented(SeleccionAleatoria.class);
    }


}
