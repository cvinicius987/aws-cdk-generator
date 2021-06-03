package br.com.cvinicius.constructors;

import br.com.cvinicius.constructors.options.EmptyConstructor;
import br.com.cvinicius.env.EnvProps;
import software.amazon.awscdk.core.App;
import software.amazon.awscdk.core.Construct;

public class FactoryConstructor {

    public static Construct of(App app){

        EnvProps props = new EnvProps(app);

        Construct construct = null;

        switch (props.getConstructorName()){
            case "empty":
                construct = new EmptyConstructor(props.getStack(), props.getStack().getStackId());
                break;
            default:
                throw new IllegalArgumentException("Construtor inválido, verique as opções disponíveis");
        }

        return construct;
    }
}
