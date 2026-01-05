package pt.iade.poo.mod04.pt1;

import java.util.List;
import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args) {
		VeiculoEnum veiculoEnum1 = new VeiculoEnum();
		VeiculoEnum veiculoEnum2 = new VeiculoEnum();
		
		veiculoEnum1.tipo = TipoVeiculo.CAMIAO;
		veiculoEnum2.tipo = TipoVeiculo.MOTOCICLETA;
		
		System.out.println(veiculoEnum1.tipo);
		System.out.println(veiculoEnum2.tipo);
		
		Carro carro = new Carro();
		Camiao camiao = new Camiao();
		
		System.out.println("Testando o carro");
		carro.ligar();
		carro.acelerar();
		carro.travar();		
		
		System.out.println("Testando o camiao");
		camiao.ligar();
		camiao.acelerar();
		camiao.travar();
		
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		
		veiculos.add(carro);
		veiculos.add(camiao);
		
		for(Veiculo veiculo : veiculos) {
			veiculo.ligar();
			veiculo.acelerar();
			veiculo.travar();
		}
	}

}
