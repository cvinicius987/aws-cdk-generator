package br.com.cvinicius;

import br.com.cvinicius.constructors.NetworkVpcSubnetGatewayConstructor;
import br.com.cvinicius.env.EnvProps;
import software.amazon.awscdk.core.App;

public class NetworkVpcSubnetGatewayApp {

    public static void main(final String[] args) {

        App app = new App();

        EnvProps envProps = new EnvProps(app);

        NetworkVpcSubnetGatewayConstructor cons = new NetworkVpcSubnetGatewayConstructor(envProps.getStack(), envProps.getStackName());

        app.synth();
    }
}