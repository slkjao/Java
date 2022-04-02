
public class Principal {

	public static void main(String args[]) {

		Video v[] = new Video[3];
		v[0] = new Video("Aula 1");
		v[1] = new Video("Faker Gameplay");
		v[2] = new Video("Cortes Casimiro");
		
		Gafanhoto g[] = new Gafanhoto[3];
		g[0] = new Gafanhoto("Pedro", 35, "Masculino", "pedroRJ");
		g[1] = new Gafanhoto("Paulinho", 22, "Masculino", "gameplayRios");
		g[2] = new Gafanhoto("Marcela", 19, "Feminino", "M_Rios");

		
		Visualizacao visu = new Visualizacao(g[2], v[1]);
		Visualizacao vis = new Visualizacao(g[2], v[0]);
		vis.avaliar(79f);
		visu.avaliar(9);
		System.out.println(visu.toString());
		System.out.println(vis.toString());
		
		System.out.println(g[2].getTotAssistido());
		System.out.println(v[1].getVizualizacao());
		
	}

}
