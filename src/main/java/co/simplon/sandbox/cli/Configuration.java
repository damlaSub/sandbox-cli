package co.simplon.sandbox.cli;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import co.simplon.cliff.CommandRegistry;
import co.simplon.cliff.Result;
import co.simplon.cliff.ResultItem;
import co.simplon.sandbox.cli.commands.EchoCommand;

final class Configuration {
	//pas private pour instancier dans main
	final static Configuration INSTANCE = new Configuration();
	private Configuration() {
		configureRegistry();
	}
	
	private void configureRegistry() {
		CommandRegistry reg = CommandRegistry.INSTANCE;
		reg.addMapping("date",() -> (cmdLine) -> {
			String output = LocalDate.now().toString();
			ResultItem item = new ResultItem(output);
			return new Result(item);
			//y a pas de constructor Marshall qu'on a ecrit dans cette function car c'est une expression lambda
		});
		reg.addMapping("time",() -> (cmdLine) -> {
			String output = LocalTime.now().toString();
			ResultItem item = new ResultItem(output);
			return new Result(item);
			//y a pas de constructor Marshall qu'on a ecrit dans cette function car c'est une expression lambda
		});
		reg.addMapping("datetime",() -> (cmdLine) -> {
			String output = LocalDateTime.now().toString();
			ResultItem item = new ResultItem(output);
			return new Result(item);
			//y a pas de constructor Marshall qu'on a ecrit dans cette function car c'est une expression lambda
		});
		reg.addMapping("who",() -> (cmdLine) -> {
			String output = System.getProperty("user.name");
			ResultItem item = new ResultItem(output);
			return new Result(item);
			//y a pas de constructor Marshall qu'on a ecrit dans cette function car c'est une expression lambda
		});
		
		
		System.out.println("Configuration.configureRegistry()");
		
		reg.addMapping("echo",() -> {
		return new EchoCommand();
		
	});
	}
}
