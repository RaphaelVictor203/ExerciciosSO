package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProcessController {
	
	Process pro;
	InputStream fluxo;
	InputStreamReader leitor;
	BufferedReader buffer;
	
	public ProcessController(){
		super();
	}
	
	public String retornaSO() {
		return System.getProperty("os.name");
	}
	
	public StringBuffer listaProcessos(String so) {
		String cmd = "";
		StringBuffer lista = new StringBuffer();
		if(so.contains("Windows")) {
			cmd = "TASKLIST /FO TABLE";
		}else
		if(so.contains("Linux")) {
			cmd = "ps -ef";
		}
		try {
			pro = Runtime.getRuntime().exec(cmd);
			fluxo = pro.getInputStream();
			leitor = new InputStreamReader(fluxo);
			buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha != null) {
				lista.append(linha+"\n");
				linha = buffer.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
	
	public void killProcess(String so, String nomeProcess) {
		StringBuffer cmd = new StringBuffer();
		if(so.contains("Windows")) {
			cmd.append("TASKKILL /IM ");
			cmd.append(nomeProcess);
		}else
		if(so.contains("Linux")) {
			cmd.append("kill -9 ");
			cmd.append(nomeProcess);
		}
		try {
			pro = Runtime.getRuntime().exec(cmd.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void killProcess(String so, int pid) {
		StringBuffer cmd = new StringBuffer();
		if(so.contains("Windows")) {
			cmd.append("TASKKILL /PID ");
			cmd.append(pid);
		}else
		if(so.contains("Linux")) {
			cmd.append("kill -KILL ");
			cmd.append(pid);
		}
		try {
			pro = Runtime.getRuntime().exec(cmd.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
