package UI;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosUI {
    public static Target LBL_PRODUCTOS=Target.the("lista de Productos")
            .locatedBy("//div[@class='product__item__top']//h3/a");


    public static Target BTN_CARRITO=Target.the("Boton de Agregar producto")
            .locatedBy("//button[@id='addToCartButton']");


    public static Target BTN_IRCARRITO=Target.the("Boton ingresar al carrito")
            .locatedBy("//a[@class='js-mobile-navigation-item js-mini-cart-link']//span");




    public static Target LBL_PRODUCTO=Target.the("lista de Productos")
            .locatedBy("//div[@class='new-container__header__title']//h1");




}
