package co.edu.uniquindio.parcial1fx.parcial1fx.factory;

public class ModelFactory {

    private static ModelFactory modelFactory;

    private ModelFactory(){}

    public static  ModelFactory getInstance(){
        if (modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

}
