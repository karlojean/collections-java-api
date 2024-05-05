package Map.Ordenacao.AgendaEventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Agenda {
    private Map<LocalDate, Evento> eventoMap;

    public Agenda() {
        this.eventoMap = new HashMap<>();
    }

    public void addEvento(LocalDate data, String nome, String atracao) {
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventos = new TreeMap<>(eventoMap);
        System.out.println(eventos);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventos = new TreeMap<>(eventoMap);

        for(Map.Entry<LocalDate, Evento> entry : eventos.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println(entry.getValue() + " : " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.addEvento(LocalDate.of(2024, Month.DECEMBER, 14), "JS SUMMIT", "John");
        agenda.addEvento(LocalDate.of(2024, Month.JULY, 11), "Linux Event", "Torvald");
        agenda.addEvento(LocalDate.of(2024, Month.SEPTEMBER, 27), "Java Workshop", "Petter");
        agenda.addEvento(LocalDate.of(2023, Month.JANUARY, 14), "C# EVENT", "Even");

        agenda.exibirAgenda();

        agenda.obterProximoEvento();

    }
}
