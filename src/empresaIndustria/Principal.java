package empresaIndustria;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class Principal {
	public static BigDecimal aumento = BigDecimal.valueOf(1.10);
	public static LocalDate dataMaior = LocalDate.now();
	public static BigDecimal totalSalarioFuncionarios = BigDecimal.ZERO;
	public static BigDecimal salarioMinimo = BigDecimal.valueOf(1212.00);
	
	public static void main(String args[]) {
		
		List<Funcionario> grupoFuncionarios = new ArrayList();
		
		LocalDate dataNasc1 = LocalDate.of(2000, 10, 18);
		BigDecimal salario1 = BigDecimal.valueOf(2009.44);
		//Funcionario funcionario1 = new Funcionario("Maria",  dataNasc1, salario1, "Operador");
		grupoFuncionarios.add(new Funcionario("Maria",  dataNasc1, salario1, "Operador"));
		
		LocalDate dataNasc2 = LocalDate.of(1990, 5, 12);
		BigDecimal salario2 = BigDecimal.valueOf(2284.38);
		//Funcionario funcionario2 = new Funcionario("João",  dataNasc2, salario2, "Operador");
		grupoFuncionarios.add(new Funcionario("João",  dataNasc2, salario2, "Operador"));
		
		LocalDate dataNasc3 = LocalDate.of(1961, 5, 2);
		BigDecimal salario3 = BigDecimal.valueOf(9836.14);
		//Funcionario funcionario3 = new Funcionario("Caio",  dataNasc3, salario3, "Coordenador");
		grupoFuncionarios.add(new Funcionario("Caio",  dataNasc3, salario3, "Coordenador"));
		
		LocalDate dataNasc4 = LocalDate.of(1988, 10, 14);
		BigDecimal salario4 = BigDecimal.valueOf(19119.88);
		//Funcionario funcionario4 = new Funcionario("Miguel",  dataNasc4, salario4, "Diretor");
		grupoFuncionarios.add(new Funcionario("Miguel",  dataNasc4, salario4, "Diretor"));
		
		LocalDate dataNasc5 = LocalDate.of(1995, 1, 5);
		BigDecimal salario5 = BigDecimal.valueOf(2234.68);
		//Funcionario funcionario5 = new Funcionario("Alice",  dataNasc5, salario5, "Recepcionista");
		grupoFuncionarios.add(new Funcionario("Alice",  dataNasc5, salario5, "Recepcionista"));
		
		LocalDate dataNasc6 = LocalDate.of(1999, 11, 19);
		BigDecimal salario6 = BigDecimal.valueOf(1582.72);
		//Funcionario funcionario6 = new Funcionario("Heitor",  dataNasc6, salario6, "Operador");
		grupoFuncionarios.add(new Funcionario("Heitor",  dataNasc6, salario6, "Operador"));
		
		LocalDate dataNasc7 = LocalDate.of(1993, 3, 8);
		BigDecimal salario7 = BigDecimal.valueOf(4071.84);
		//Funcionario funcionario7 = new Funcionario("Arthur",  dataNasc7, salario7, "Contador");
		grupoFuncionarios.add(new Funcionario("Arthur",  dataNasc7, salario7, "Contador"));
		
		LocalDate dataNasc8 = LocalDate.of(1994, 7, 8);
		BigDecimal salario8 = BigDecimal.valueOf(3017.45);
		//Funcionario funcionario8 = new Funcionario("Laura",  dataNasc8, salario8, "Gerente");
		grupoFuncionarios.add(new Funcionario("Laura",  dataNasc8, salario8, "Gerente"));
		
		LocalDate dataNasc9 = LocalDate.of(2003, 5, 24);
		BigDecimal salario9 = BigDecimal.valueOf(1606.85);
		//Funcionario funcionario9 = new Funcionario("Heloisa",  dataNasc9, salario9, "Eletricista");
		grupoFuncionarios.add(new Funcionario("Heloisa",  dataNasc9, salario9, "Eletricista"));
		
		LocalDate dataNasc10 = LocalDate.of(1996, 9, 2);
		BigDecimal salario10 = BigDecimal.valueOf(2799.93);
		//Funcionario funcionario10 = new Funcionario("Helena",  dataNasc10, salario10, "Gerente");
		grupoFuncionarios.add(new Funcionario("Helena",  dataNasc10, salario10, "Gerente"));
		
		System.out.println("*************Lista de Funcionarios: *************");
		System.out.println("");
		System.out.println("Nome | Data Nascimento | Salario | Função");
		for(Funcionario item: grupoFuncionarios) {
			System.out.println(item.getNome() +" | "+ item.getDataNascimento().getDayOfMonth()+"/"+ item.getDataNascimento().getMonthValue() +"/"+ item.getDataNascimento().getYear() +" | "+ item.getSalario() +" | "+ item.getFuncao());
		}
		
		System.out.println("");		
		System.out.println("**********Remover Funcionario João Da Lista**********");
		System.out.println("");
		
		grupoFuncionarios.removeIf(funcionario -> funcionario.getNome().equals("João"));
		
		for(Funcionario item: grupoFuncionarios) {
			System.out.println(item.getNome() +" | "+ item.getDataNascimento().getDayOfMonth()+"/"+ item.getDataNascimento().getMonthValue() +"/"+ item.getDataNascimento().getYear() +" | "+ item.getSalario() +" | "+ item.getFuncao());
			}
		
		System.out.println("");		
		System.out.println("**********Formatar Data e Aumentar 10% Salario**********");
		System.out.println("");
		
		grupoFuncionarios.forEach(funcionario -> funcionario.setSalario(funcionario.getSalario().multiply(aumento)));
		
		for(Funcionario item: grupoFuncionarios) {
			System.out.println(item.getNome() +" | "+ item.getDataNascimento().getDayOfMonth()+"/"+ item.getDataNascimento().getMonthValue() +"/"+ item.getDataNascimento().getYear() +" | R$ "+ NumberFormat.getInstance(new Locale("pt", "BR")).format(item.getSalario())  +" | "+ item.getFuncao());
			}
		
		
		System.out.println("");		
		System.out.println("**********Agrupando Funcionarios por Função**********");
		System.out.println("");
		
		Map<String, List<Funcionario>> mapaFuncionarioFuncao = new HashMap();
		
		for(Funcionario funcao: grupoFuncionarios){
			mapaFuncionarioFuncao.computeIfAbsent(funcao.getFuncao(), valor -> new ArrayList<>()).add(funcao);	
		}
		mapaFuncionarioFuncao.forEach((chave, valor)->{
			System.out.println("Função: " + chave);
			valor.forEach(funcionario ->  
			System.out.println(funcionario.getNome() +" | "+ funcionario.getDataNascimento().getDayOfMonth()+"/"+ funcionario.getDataNascimento().getMonthValue() +"/"+
			funcionario.getDataNascimento().getYear() +" | R$ "+ NumberFormat.getInstance(new Locale("pt", "BR")).format(funcionario.getSalario())  +" | "+ funcionario.getFuncao()));
		});
		
		System.out.println("");		
		System.out.println("**********Agrupando Funcionarios Mês de aniversario em 10 e 12 **********");
		System.out.println("");
		
		Map<LocalDate, List<Funcionario>> mapaFuncionarioDateNasc = new HashMap();
		
		for(Funcionario funcionario: grupoFuncionarios) {
			mapaFuncionarioDateNasc.computeIfAbsent(funcionario.getDataNascimento(), valor -> new ArrayList<>()).add(funcionario);
		}
		
		mapaFuncionarioDateNasc.forEach((chave, valor)->{
			if(chave.getMonthValue() == 10 || chave.getMonthValue() == 12) {
				valor.forEach(funcionario ->
				System.out.println(funcionario.getNome() +" | "+ funcionario.getDataNascimento().getDayOfMonth()+"/"+ funcionario.getDataNascimento().getMonthValue() +"/"+
				funcionario.getDataNascimento().getYear() +" | R$ "+ NumberFormat.getInstance(new Locale("pt", "BR")).format(funcionario.getSalario())  +" | "+ funcionario.getFuncao()));
			}
		});
		
		System.out.println("");		
		System.out.println("**********Funcionarios Maior idade **********");
		System.out.println("");
		
		String nomeFuncionario = "";

		mapaFuncionarioDateNasc.forEach((chave, valor)->{
			if(chave.isBefore(dataMaior)) {
				dataMaior = chave;
			}});
		
		mapaFuncionarioDateNasc.forEach((chave, valor)->{
			if(chave == dataMaior) {
				valor.forEach(funcionario ->
				System.out.println("Funcionario(a): "+ funcionario.getNome() + "| Idade: " + Period.between(funcionario.getDataNascimento(), LocalDate.now()).getYears()));
				
			
			}
		});
		
		System.out.println("");		
		System.out.println("**********Funcionarios por ordem alfabetica **********");
		System.out.println("");
		
		Map<String, List<Funcionario>> mapFuncionarioNome = new TreeMap();
		
		for(Funcionario funcionario: grupoFuncionarios) {
			mapFuncionarioNome.computeIfAbsent(funcionario.getNome(), valor -> new ArrayList<>()).add(funcionario);
		}
		
		mapFuncionarioNome.forEach((chave, valor)->{
			valor.forEach(funcionario ->
			System.out.println(funcionario.getNome() +" | "+ funcionario.getDataNascimento().getDayOfMonth()+"/"+ funcionario.getDataNascimento().getMonthValue() +"/"+
			funcionario.getDataNascimento().getYear() +" | R$ "+ NumberFormat.getInstance(new Locale("pt", "BR")).format(funcionario.getSalario())  +" | "+ funcionario.getFuncao()));
		});
		
		System.out.println("");		
		System.out.println("**********Funcionarios - Total de Salarios **********");
		System.out.println("");
		
		mapFuncionarioNome.forEach((chave, valor)->{
			valor.forEach(funcionario -> totalSalarioFuncionarios = totalSalarioFuncionarios.add(funcionario.getSalario()));
		});
		
		System.out.println("Total de Salario: R$ " + NumberFormat.getInstance(new Locale("pt", "BR")).format(totalSalarioFuncionarios));
		
		System.out.println("");		
		System.out.println("**********Funcionarios - Quantidade Salarios Minimos por Funcionario **********");
		System.out.println("**********Salario Minimo: R$ 1.212,00 **********");
		System.out.println("");
		
		mapFuncionarioNome.forEach((chave, valor)->{
			valor.forEach(funcionario -> 
			System.out.println("Funcionario: " + funcionario.getNome() + " | Qtd Salarios Minimo: " + funcionario.getSalario().divide(salarioMinimo, 2, RoundingMode.HALF_UP)));
			
		});

		
	}
	
	
	
	
	
		
}
		
	


