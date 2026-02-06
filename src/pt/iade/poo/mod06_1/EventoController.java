package pt.iade.poo.mod06_1;

import java.util.ArrayList;

public class EventoController {
	private ArrayList<Evento> eventos;
	private EventoView view;

	public EventoController(EventoView view) {
		this.eventos = new ArrayList<>();
		this.view = view;
	}

	public void adicionarEvento() {
		String descricao = view.getDescricao();
		String data = view.getData();
		Evento evento = new Evento(descricao, data);
		eventos.add(evento);
		view.displayEvento(evento);
	}

	public void listarEventos() {
		Evento[] eventosArray = new Evento[eventos.size()];
		eventos.toArray(eventosArray);
		view.displayAllEventos(eventosArray);
	}
}