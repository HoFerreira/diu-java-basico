package apps;
public class MSNMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem atraves do Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem atraves do Messenger");
	}
}
