package com.alkosto.stepDefinitions;

import interactions.ObtenerNombreProducto;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import questions.ValidacionProducto;
import tasks.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AgregarProductoStepDef {



    @Before
    public void setupActor() {
        setTheStage(new OnlineCast());
    }






    @Dado("que el usuario abre el navegador e ingresa a la pagina de Alkosto.com")
    public void queElUsuarioAbreElNavegadorEIngresaALaPaginaDeAlkostoCom() {

        theActorCalled("user").wasAbleTo(
                PaginaPrincipalTask.abrirNav(),
                CerrarCookiesTask.cerrar()

        );
    }
    @Cuando("El usuario seleciona un Producto y lo agrega al carrito")
    public void elUsuarioSelecionaUnProductoYLoAgregaAlCarrito() {

        theActorInTheSpotlight().attemptsTo(
                BuscarTask.buscar(),
                SeleccionarAgregarTask.seleccionarAgregar(),
                ObtenerNombreProducto.nombreProducto("producto1")
        );

    }
    @Cuando("regresa a la pagina principal y selecciona un nuevo producto")
    public void regresaALaPaginaPrincipalYSeleccionaUnNuevoProducto() {
        theActorInTheSpotlight().attemptsTo(
                RegresarPaginaTask.regresarPag(),
                SeleccionarAgregarTask.seleccionarAgregar(),
                ObtenerNombreProducto.nombreProducto("producto2"),
                CarritoTask.irCarrito()
        );
    }
    @Entonces("el usuario podra ver los productos seleccionados en el carrito")
    public void elUsuarioPodraVerLosProductosSeleccionadosEnElCarrito() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionProducto.validar("producto1","producto2"),
                        Matchers.equalTo(true)
                )

        );
    }

}
