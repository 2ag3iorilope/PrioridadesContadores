package PrioridadesContadores;

public class PrioridadesContadores {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());  

        int nCuentas = 2; 
        String nombreHiloLanzador = "HiloPrincipal";  

       
        Cuentas hiloCuantas = new Cuentas(nCuentas, nombreHiloLanzador);
        hiloCuantas.start();  
    }
}

/**
 * Hariak kudeatzen dituen eta lehentasunek horiek gauzatzean duten eragina erakusten duen programa.
 * 
 * - "Kontuak" klaseak "Kontagailua" klaseko hari multzo bat sortzen du, bakoitzari lehentasun espezifiko bat esleituz.
 * - "Contador" klaseko hari bakoitzak 500.000 iterazio egiten ditu ausazko balioak batuz.

 * - "Kontuak" klaseak harien egoera kontrolatzen eta monitorizatzen du, aurrerapena eta lehentasuna inprimatuz.
 * - Programak exekutatzen jarraitzen du hari guztiak amaitu arte.
 * 
 * Programa honi esker, lehentasunek harien exekuzioan nola eragiten duten ikus daiteke.
 */
