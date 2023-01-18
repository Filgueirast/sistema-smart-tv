public class Usuario {
    public static void main(String[] args) throws Exception {


        ControleSmartTV controleSmartTV = new ControleSmartTV();

        
        controleSmartTV.diminuirVolume();
        controleSmartTV.diminuirVolume();
        controleSmartTV.diminuirVolume();
        controleSmartTV.aumentarVolume();


        System.out.println("TV Ligada? " + controleSmartTV.ligada);
        System.out.println("Canal Atual: " + controleSmartTV.canal);
        System.out.println("Volume Atual: " + controleSmartTV.volume);


    }
}
