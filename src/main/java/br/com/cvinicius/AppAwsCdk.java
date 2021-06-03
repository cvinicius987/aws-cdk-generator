package br.com.cvinicius;

import br.com.cvinicius.constructors.FactoryConstructor;
import software.amazon.awscdk.core.App;

public class AppAwsCdk {

    public static void main(final String[] args) {

        App app = new App();

        FactoryConstructor.of(app);

        app.synth();
    }
}