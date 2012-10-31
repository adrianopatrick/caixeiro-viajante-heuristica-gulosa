package br.uece.caixeiroviajanteguloso.heuristica;

import br.uece.caixeiroviajanteguloso.ui.frmPrincipal;



public class Main {
	
	public static void main(String[] args) {
		frmPrincipal form = new frmPrincipal();
		form.setVisible(true);
	}

// Main para calculo do tempo de execução
//
//	public static void main(String[] args) {
//		
//		long inicio = System.nanoTime();
//		
//		//File diretorio = new File(new Main().getRelativePath().getFile());
//		//File[] files = diretorio.listFiles();
//		
//		//for (File file : files) {
//			//if(file.getName().endsWith("fl1400.txt")){
//				File file = new File(new Main().getRelativePath().getFile()+"fl1400.txt");
//				Celula[][] matriz = new ArquivoUtils().lerArquivo(file);
//				ThreadGroup threadGroup = new ThreadGroup("caixeiro");
//				Fluxo[] fluxos = new Fluxo[matriz.length];
//				
//				for (int i = 0; i < fluxos.length; i++) {
//					fluxos[i] = new Fluxo(threadGroup, "Thr"+i, i, file);
//					fluxos[i].start();
//					
//					System.gc();
//				}
//				
//				while(threadGroup.activeCount() != 0);
//				
//				List<Caminho> caminhos = Fluxo.getCaminhos();
//				for (Caminho caminho : caminhos) {
//					Ponto[] pontos = caminho.getCaminho();
//					for (Ponto ponto : pontos) {
//						System.out.print(ponto.getId()+" --> ");
//					}
//					
//					System.out.println("Distancia: " + caminho.getDistancia());
//				}
//			//}
//				
//		//}
//		
//		long total = System.nanoTime() - inicio;
//		System.out.println("tempo total: "+total/1000000000);
//		
//	}
//	
//	public URL getRelativePath(){
//		return getClass().getResource("../../../../arquivos/");
//	}
}
