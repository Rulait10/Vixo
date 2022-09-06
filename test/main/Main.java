import vixo.interpereter.loader.Loader;

public class Main { 
    public static void main(String[] args) {
        
        String code = "";
        Loader vixo = new Loader();
        
        System.out.println(vixo.interpret(code));
        
    }
}
