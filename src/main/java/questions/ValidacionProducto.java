package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static UI.CarritoUI.*;


public class ValidacionProducto implements Question<Boolean> {

    private String producto1;
    private String producto2;

    public ValidacionProducto(String producto1, String producto2) {
        this.producto1 = producto1;
        this.producto2 = producto2;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String productoCarro = LBL_PRODUCTOCARRO.resolveFor(actor).getText();
        String productoCarro2 = LBL_PRODUCTOCARRO2.resolveFor(actor).getText();
        String productoInicial1 = actor.recall(producto2);
        String productoInicial2 = actor.recall(producto1);
        return productoInicial1.contains(productoCarro) && productoInicial2.contains(productoCarro2);
    }

    public static Question<Boolean> validar(String producto1, String producto2) {return new ValidacionProducto(producto1, producto2);}


}
