package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MockitoBean
class PruebaSumaTest {

    /**
     * Aquí puedes definir los métodos de prueba utilizando Mockito
     * Por ejemplo, puedes simular el comportamiento del logger o de la suma
     * y verificar que se llamen con los parámetros correctos.
     * <p>
     * Ejemplo de un método de prueba (vacío por ahora):
     **/
    @Test
    void testSuma() {
        PruebaSuma pruebaSuma = new PruebaSuma();
        int resultado = pruebaSuma.suma(2, 3);
        assertEquals(5, resultado);
    }

}