package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DevolverPagina implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        BrowseTheWeb.as(actor).getDriver().navigate().back();

        JavascriptExecutor js = (JavascriptExecutor) BrowseTheWeb.as(actor).getDriver();
        js.executeScript("window.scrollTo(0, 0);");
    }


    public static Performable devolver(){
        return instrumented(DevolverPagina.class);
    }

}
