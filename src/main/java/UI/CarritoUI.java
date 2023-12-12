package UI;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoUI {


    public static Target LBL_PRODUCTOCARRO=Target.the("Producto en el carrito")
            .locatedBy("(//div[@class='item-column item__info']//a//span)[1]");

    public static Target LBL_PRODUCTOCARRO2=Target.the("Producto en el carrito")
            .locatedBy("(//div[@class='item-column item__info']//a//span)[2]");



}
