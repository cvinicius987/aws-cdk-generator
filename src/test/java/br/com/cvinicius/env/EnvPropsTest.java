package br.com.cvinicius.env;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.ConstructNode;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class EnvPropsTest {

    private App app;
    private ConstructNode constructNode;

    @BeforeEach
    public void prepare(){
        app           = mock(App.class);
        constructNode = mock(ConstructNode.class);
    }

    @Test
    public void getConstructorName_name_required(){

        Exception ex = assertThrows(NullPointerException.class, () -> {

            when(constructNode.tryGetContext("constructor")).thenReturn(null);
            when(app.getNode()).thenReturn(constructNode);

            EnvProps envProps = new EnvProps(app);

            envProps.getConstructorName();
        });

        assertTrue(ex.getMessage().contains("Nome do Construtor é obrigatório."));
    }

    @Test
    public void getConstructorName_is_ok(){

        when(constructNode.tryGetContext("constructor")).thenReturn("empty");
        when(app.getNode()).thenReturn(constructNode);

        EnvProps envProps = new EnvProps(app);

        String result = envProps.getConstructorName();

        assertEquals("empty", result);
    }
}
