package co.simplon.sandbox.cli;

import co.simplon.cliff.CliffApplication;

public class SandboxApplication {

	public static void main(String[] args) {
		
		Configuration conf=	Configuration.INSTANCE;
		CliffApplication.run(args);
		
	}

}
