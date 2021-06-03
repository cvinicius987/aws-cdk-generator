package br.com.cvinicius.env;

import software.amazon.awscdk.core.*;

public class EnvProps {

    private App app;
    private ConstructNode constructNode;

    public EnvProps(App app){
        this.app = app;
        this.constructNode = app.getNode();
    }

    public String getEnvironmentName(){
        return String.valueOf(this.constructNode.tryGetContext("envName"));
    }

    public String getAccountId(){
        return String.valueOf(this.constructNode.tryGetContext("accountId"));
    }

    public String getRegion(){
        return String.valueOf(this.constructNode.tryGetContext("region"));
    }

    public String getStackName(){
        return String.valueOf(this.constructNode.tryGetContext("stackName"));
    }

    public Environment getEnv(){

        return Environment.builder()
                    .account(getAccountId())
                    .region(getRegion())
                .build();
    }

    public Stack getStack(){

        return new Stack(this.app, getStackName(), StackProps.builder()
                    .stackName(String.format("%s-%s", getEnvironmentName(), getStackName()))
                    .env(getEnv())
                .build());
    }
}