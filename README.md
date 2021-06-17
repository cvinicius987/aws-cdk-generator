# AWS CDK Generator

Aplicação para criar ambientes no Cloud AWS utilizando o CDK como ferramenta de geração de infra-as-code.

## Configuração do Ambiente

- [Criação conta AWS](docs/AWS.md)
- [Configuração do ambiente CDK](docs/CONFIGURE.md)

## Aplicação

```
cdk deploy -c accountId=<here> -c region=<here>  -c envName=<here> -c stackName=<here>
```
- *accountId*: ID da conta onde os recursos serão criados (Default: Conta vinculada ao AWS CLI);
- *region*: Região onde os recursos serão criados (Default: Região do AWS CLI);
- *envName*: No do ambiente que será criado, no caso podemos ter prod, homolog, dev, etc (Default: test);
- *stackName*: Nome da Stack CloudFormation Criada (Default: Nome do Construtor);
- *constructor*: Nome da Construtor que será executado.

[⬆ Voltar ao topo](#aws-cdk-series)<br />
