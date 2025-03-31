package projeto;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o dia, mês e ano:");
        int dia = teclado.nextInt();
        int mes = teclado.nextInt();
        int ano = teclado.nextInt();

        conta(dia, mes, ano); // Agora não retorna nada, apenas imprime

        teclado.close();
    }

    private static void conta(int dia, int mes, int ano) {
        Calendar hoje = Calendar.getInstance();

        int diah = hoje.get(Calendar.DAY_OF_MONTH);
        int mesh = hoje.get(Calendar.MONTH) + 1;
        int anoh = hoje.get(Calendar.YEAR);

        LocalDate dataAtual = LocalDate.of(anoh, mesh, diah);
        LocalDate dataFutura = LocalDate.of(ano, mes, dia);


        Period periodo = Period.between(dataAtual, dataFutura);

        System.out.println("Faltam " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " +
                periodo.getDays() + " dias.");
    }
}
