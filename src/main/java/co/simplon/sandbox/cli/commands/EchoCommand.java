package co.simplon.sandbox.cli.commands;

import co.simplon.cliff.ANSIColor;
import co.simplon.cliff.ANSITheme;
import co.simplon.cliff.Command;
import co.simplon.cliff.CommandLine;
import co.simplon.cliff.Result;
import co.simplon.cliff.ResultItem;

public final class EchoCommand implements Command {
	private final static ANSITheme THEME= new ANSITheme(ANSIColor.BACKGROUND_GREEN, ANSIColor.TEXT_MAGENTA);

	public EchoCommand() {
		System.out.println("EchoCommand.EchoCommand()");
	}
	@Override
	public Result execute(CommandLine cmdLine) {
		String output = cmdLine.remainder();
		if(output==null) {
			output= "";
		}
		ResultItem item = new ResultItem(output);
		return new Result(THEME ,item);
	}

}
