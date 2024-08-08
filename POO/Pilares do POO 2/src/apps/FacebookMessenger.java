package apps;
public class FacebookMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem atraves do Facebook");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem atraves do Facebook");
	}
}
