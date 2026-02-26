import java.math.BigDecimal;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {

		ArrayList<Video> videosDoYT = new ArrayList<>();
		ArrayList<Gafanhoto> Viewrs = new ArrayList<>();

		videosDoYT.add(new Video("Teste"));
		videosDoYT.add(new Video("Sla"));
		videosDoYT.add(new Video("Teste2"));


		Viewrs.add(new Gafanhoto("V1",18,"M","SSA@gmail.com"));
		Viewrs.add(new Gafanhoto("V2",22,"F","F22@gmail.com"));

		Visualizacao visu = new Visualizacao(videosDoYT.get(0),Viewrs.get(0));
		visu.avaliar(BigDecimal.valueOf(90));



		visu = new Visualizacao(videosDoYT.get(0),Viewrs.get(1));
		visu.avaliar(BigDecimal.valueOf(90));

		System.out.println();
		System.out.println(videosDoYT.get(0));
		System.out.println(videosDoYT.get(1));

		System.out.println();
		System.out.println(Viewrs.get(0));
		System.out.println(Viewrs.get(1));




	}
}