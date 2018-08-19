package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class RedesController {
	private String so;
	private Process pro;
	private InputStream fluxo;
	private InputStreamReader leitor; 
	private BufferedReader buffer;
	private String linha;
	
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
			pro = Runtime.getRuntime().exec(path);
			fluxo = pro.getInputStream();
			leitor = new InputStreamReader(fluxo); 
			buffer = new BufferedReader(leitor);
			linha = buffer.readLine();
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
	
	public void ping() {
		String path = "";
		double tempoMedioPing = 0.0, ms = 0.0;
		int cont = 0;
		if(so.contains("Windows")) {
			path = "ping -n 10 www.google.com.br";
		}else
		if(so.contains("Linux")) {
			path = "ping -c 10 www.google.com.br";
		}
		try {
			pro = Runtime.getRuntime().exec(path);
			fluxo = pro.getInputStream();
			leitor = new InputStreamReader(fluxo); 
			buffer = new BufferedReader(leitor);
			linha = buffer.readLine();
			while(linha != null) {
				if(linha.contains("tempo=") || linha.contains("time=")) {
					ms = Double.parseDouble(linha.substring(
							(linha.lastIndexOf("=")+1), (linha.length()-3)));
					cont++;
					System.out.println("Resposta "+cont+" = "+ms+"ms.");
					tempoMedioPing += ms;
				}
				linha = buffer.readLine();
			}
			tempoMedioPing /= cont;
			DecimalFormat formato = new DecimalFormat("#.##");
			System.out.println("Tempo médio de PING = "+formato.format(tempoMedioPing)+"ms.");
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
