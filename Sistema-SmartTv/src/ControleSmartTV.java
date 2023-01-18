    public class ControleSmartTV {
        static boolean ligada = false;
        static int canal = 1;
        static int volume = 25;
        
        
        // inicio Mudança de canais
        public void aumentarCanal(){
            canal++;

        }

        public void diminuirCanal(){
            canal--;
        }

        public void mudarcanal (int novoCanal){
            canal = novoCanal;
        }
        //Fim mudança de canais

        //Inicio Mudança de volume
        public void aumentarVolume(){
            volume++;
        }

        public void diminuirVolume(){
            volume--;
        }
        //Fim mudancça de volume

    }
