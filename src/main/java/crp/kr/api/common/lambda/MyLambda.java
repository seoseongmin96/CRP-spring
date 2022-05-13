package crp.kr.api.common.lambda;

public class MyLambda {
    @FunctionalInterface
    interface MyFunction { int execute(String arg);}

    @FunctionalInterface
    interface MyConsumer {void execute(String arg);}

    @FunctionalInterface
    interface MySupplier{ int execute();}

    @FunctionalInterface
    interface Mypredicate{ boolean execute(String arg);}

    @FunctionalInterface
    interface MyInterface{String myMethod();}

    @FunctionalInterface
    interface MyUnaryOp{int operator(Integer a);}

    @FunctionalInterface
    interface MathOperation{int execute(int a , int b);}

}




