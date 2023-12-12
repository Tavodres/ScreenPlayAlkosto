package UI;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipalUI {

    public static Target TXT_BUSCAR=Target.the("Buscar Producto")
            .locatedBy("//input[@id='js-site-search-input']");


    public static Target BTN_COOKIES=Target.the("Boton de Cerrar Cookies")
            .locatedBy("//div[@class='cookies-button']//button");





}
