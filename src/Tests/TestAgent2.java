package Tests;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.security.CodeSource;

import agents.Agent2;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;


public class TestAgent2 {
    public static void main(String[] args) throws AttachNotSupportedException,
            IOException, AgentLoadException, AgentInitializationException, URISyntaxException {
    	 VirtualMachine vm = VirtualMachine.attach(args[0]);
    	 CodeSource codeSource =  Agent2.class.getProtectionDomain().getCodeSource();
         File file = new File(codeSource.getLocation().toURI().getPath());
         String path = file.getAbsolutePath();
         System.out.println("load jar: " + path);
         vm.loadAgent(path, "");
    }
}