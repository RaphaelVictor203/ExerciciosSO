package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	private String so;
	
	public RedesController() {
		super();
		so = System.getProperty("os.name");
	}
	
	public void ip() {
		String path = "";
		String adaptador = "";
		String ipv4 = "";
		StringBuffer texto = new StringBuffer();
		if(so.contains("Windows")) {
			path = "ipconfig";
			adaptador = "Adaptador";
			ipv4 = "IPv4";
		}else 
		if(so.contains("Linux")){
			path = "ifconfig";
			adaptador = "Link encap";
			ipv4 = "inet addr";
		}
		try {
			Process pro = Runtime.getRuntime().exec(path);
			InputStream fluxo = pro.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo); 
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			texto.append("");
			while(linha != null) {
				if(so.contains("Windows")) {
					ipWindows(path, adaptador, ipv4, linha, texto);
				}else 
				if(so.contains("Linux")){
					ipLinux(path, adaptador, ipv4, linha, texto);
				}
				linha = buffer.readLine();
			}
			System.out.println(texto.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void ipWindows(String path, String adaptador, String ipv4, String linha, StringBuffer texto) {
		if(linha.contains(adaptador)) {
			if(texto.toString().contains(adaptador) && texto.toString().contains(ipv4)) {
				System.out.println(texto.toString());
				texto.delete(0, texto.length());
			}else {
				texto.delete(0, texto.length());
			}
			texto.append(linha);
		}else
		if(linha.contains(ipv4)) {
			texto.append(linha);
		}
	}
	
	private void ipLinux(String path, String adaptador, String ipv4, String linha, StringBuffer texto) {
		String[] linhas = linha.split(" ");
		if(linha.contains(adaptador)) {
			if(texto.toString().contains(adaptador) && texto.toString().contains(ipv4)) {
				System.out.println(texto.toString());
				texto.delete(0, texto.length());
			}else {
				texto.delete(0, texto.length());
			}
			texto.append(linhas[1]);
		}else
		if(linha.contains(ipv4)) {
			texto.append(linhas[0]);
		}
	}
}
