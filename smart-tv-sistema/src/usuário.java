public class usuário {
    public static void main(String[] args) throws Exception {
       
        SmarTv smarTv = new SmarTv();
        
        smarTv.diminuirvolume();
        smarTv.diminuirvolume();
        smarTv.diminuirvolume();
        smarTv.aumentarvolume();

        System.out.println("Volume Atual: "+smarTv.volume);
        System.out.println("Canal atual: " + smarTv.canal);
        System.out.println("TV Ligada? " + smarTv.ligada);
        smarTv.mudarCanal(2);
        System.out.println("Canal atual: " + smarTv.canal);
        System.out.println("Volume Atual: "+smarTv.volume);

        smarTv.ligar();
        System.out.println("Novo Status - TV Ligada ? " + smarTv.ligada);

        smarTv.desligar();
        System.out.println("Novo Status - TV Ligada ? " + smarTv.ligada);

    }
}
