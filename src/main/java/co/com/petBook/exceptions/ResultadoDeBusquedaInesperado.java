package co.com.petBook.exceptions;

public class ResultadoDeBusquedaInesperado  extends AssertionError {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public static final String ENCONTRADO_OTRO_RESULTADO = "El resultado obtenido no es el esperado";

    public ResultadoDeBusquedaInesperado(String message, Throwable cause){
        super(message, cause);
    }
}
