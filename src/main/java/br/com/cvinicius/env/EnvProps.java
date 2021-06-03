package br.com.cvinicius.env;

import software.amazon.awscdk.core.*;

import java.util.Objects;
import java.util.Optional;

/**
 * Contract to extract the prompt attributes
 *
 * @author cvinicius
 * @since 02/06/2021
 * @version 1.0
 */
public class EnvProps {

    private App app;
    private ConstructNode constructNode;

    public EnvProps(App app){
        this.app = app;
        this.constructNode = app.getNode();
    }

    /**
     * Return the AWS Env
     *
     * @return Environment
     */
    public Environment getEnv(){

        String accountId = String.valueOf(this.constructNode.tryGetContext("accountId"));
        String region    = String.valueOf(this.constructNode.tryGetContext("region"));

        return Environment.builder()
                    .account(accountId)
                    .region(region)
                .build();
    }

    /**
     * Return a Stack Cloud Formation
     *
     * @return Stack
     */
    public Stack getStack(){

        String stackName = Optional.ofNullable(String.valueOf(this.constructNode.tryGetContext("stackName")))
                                    .orElse("test");

        String envName = Optional.ofNullable(String.valueOf(this.constructNode.tryGetContext("envName")))
                                    .orElse("default");

        return new Stack(this.app, stackName, StackProps.builder()
                    .stackName(String.format("%s-%s", envName, stackName))
                    .env(getEnv())
                .build());
    }

    /**
     * Recupera o nome do Construtor
     *
     * @return String
     */
    public String getConstructorName(){

        Object obj = constructNode.tryGetContext("constructor");

        Objects.requireNonNull(obj, "Nome do Construtor é obrigatório.");

        return String.valueOf(obj);
    }
}