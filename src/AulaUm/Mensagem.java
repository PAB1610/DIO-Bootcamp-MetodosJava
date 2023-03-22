package AulaUm;

public class Mensagem {

    public static void obterMensagem(int hora){

        if(hora<0 || hora > 23) {
            mensagemErro();
        }
        else{
            if(hora>=5 && hora<=12)
                mensagemBomDia();
            else if (hora>=13 && hora<=17) {
                mensagemBoaTarde();
            }else{
                mensagemBoaNoite();
            }
        }

    }

    private static void mensagemBomDia(){
        System.out.println("Bom dia");
    }

    private static void mensagemBoaTarde(){
        System.out.println("Boa Tarde");
    }

    private static void mensagemBoaNoite(){
        System.out.println("Boa Noite");
    }

    private static void mensagemErro(){
        System.out.println("Hora invalida!");
    }
}
