public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico{

    @Override
    public void adicionarAba() {
        // TODO Auto-generated method stub
        System.out.println("Adicionando nova aba...");
        
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Página atualizada.");
        
    }

    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        System.out.println("Exibindo página: "+url);
        
    }

    @Override
    public void SelecionarMusica(String musica) {
        // TODO Auto-generated method stub
        System.out.println("Tocando: "+musica);
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausando música...");
        
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Recebendo ligação...");
        
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo ligação...");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Iniciando correio de voz...");
        
    }

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        System.out.println("Ligando para: "+numero);
        
    }
    
}
