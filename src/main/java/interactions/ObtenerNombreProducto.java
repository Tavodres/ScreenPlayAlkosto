package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.ArrayList;
import java.util.List;

import static UI.ProductosUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ObtenerNombreProducto  implements Interaction {


    private String producto;

    public ObtenerNombreProducto(String variableRecuerdo) {
        this.producto = variableRecuerdo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String nameProduct = LBL_PRODUCTO.resolveFor(actor).getText();
        actor.remember(producto, nameProduct);
    }

    public static Performable nombreProducto(String producto) {return instrumented(ObtenerNombreProducto.class, producto);
    }



}



/*
*
* public <T extends Actor> void performAs(T actor) {

        String nombreProducto = LBL_PRODUCTO.resolveFor(actor).getText();
        List<String>  listaProductos = actor.recall("listaProductos");

        if (listaProductos == null) {
            listaProductos = new ArrayList<>();
        }

        listaProductos.add(nombreProducto);

        actor.remember("listaProductos",nombreProducto);

        String productoInicial = listaProductos.get(0);
        //String productoInicial2 = listaProductos.get(1);




         }
*
*
* */