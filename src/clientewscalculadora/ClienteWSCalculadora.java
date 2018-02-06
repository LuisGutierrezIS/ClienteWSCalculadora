package clientewscalculadora;

public class ClienteWSCalculadora {

    public static void main(String[] args) {
        System.out.println("5+5="+sumar(5,5));
        System.out.println("5-2="+restar(5,2));
        System.out.println("5*5="+multiplicar(5,5));
        System.out.println("5/2="+dividir(5,2));
    }

    private static int sumar(int n1, int n2) {
        clientewscalculadora.Calcular_Service service = new clientewscalculadora.Calcular_Service();
        clientewscalculadora.Calcular port = service.getCalcularPort();
        return port.sumar(n1, n2);
    }

    private static int restar(int n1, int n2) {
        clientewscalculadora.Calcular_Service service = new clientewscalculadora.Calcular_Service();
        clientewscalculadora.Calcular port = service.getCalcularPort();
        return port.restar(n1, n2);
    }

    private static int multiplicar(int n1, int n2) {
        clientewscalculadora.Calcular_Service service = new clientewscalculadora.Calcular_Service();
        clientewscalculadora.Calcular port = service.getCalcularPort();
        return port.multiplicar(n1, n2);
    }

    private static double dividir(int n1, int n2) {
        clientewscalculadora.Calcular_Service service = new clientewscalculadora.Calcular_Service();
        clientewscalculadora.Calcular port = service.getCalcularPort();
        return port.dividir(n1, n2);
    }
    
}
