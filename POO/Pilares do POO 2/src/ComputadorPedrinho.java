import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		ServicoMensagemInstantanea smi = null;

		String appEscolhido = "facebook";

		if (appEscolhido.equals("messenger")) 
			smi = new MSNMessenger();
		else if (appEscolhido.equals("facebook"))
			smi = new FacebookMessenger();
		else if (appEscolhido.equals("telegram"))
			smi = new Telegram();

		smi.enviarMensagem();
		smi.receberMensagem();
	}
}