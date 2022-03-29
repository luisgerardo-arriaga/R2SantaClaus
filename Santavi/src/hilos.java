/**Integrantes
 * Pepo
 * Willy
 * Héctor
 * Magaña
 */
public class hilos {
    public boolean ban;
        
	public void run(int duendes) {

            //boolean duenB = false;
            if(duendes == 0){
                this.ban = false;
            }
            if(duendes >= 3){
                this.ban = true;
            }
            if(this.ban){
                try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
            }
	}


	private void dormir(int segundos) {
            if(this.ban){
                try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
            }
            
	}
}
