package lambdas.Functional_Interface.BinaryOperator;

//TODO: BinaryOperator recebe 2 parametros e retorna 1 parametro todos do mesmo tipo.

@FunctionalInterface
public interface Calculo {

    double executar(double a, double b);
}
