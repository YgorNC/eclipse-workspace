
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Márcia");
		g1.setSalario(9000);
		
		EditorVideo ev1 = new EditorVideo();
		ev1.setNome("Lusca");
		ev1.setSalario(2500);
		
		Designer d = new Designer();
		d.setNome("Levy");
		d.setSalario(3000);
		
		ControleBonificacao gs1 = new ControleBonificacao();
		gs1.registra(g1);
		
		ControleBonificacao gs3 = new ControleBonificacao();
		gs3.registra(ev1);
		
		ControleBonificacao d1 = new ControleBonificacao();
		d1.registra(d);
		
		System.out.println(gs1.getSoma());
		System.out.println(gs3.getSoma());
		System.out.println(d1.getSoma());
		
	}
}
