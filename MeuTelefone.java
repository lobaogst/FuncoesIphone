package ModelandoIphone;

import java.util.Set;

public class MeuTelefone implements Iphone {
	private boolean iphoneLigado , sinalRede ,tocandoMusica,chamando,emligacao ,sinalInternet,navegadorAberto;

	public boolean getIphoneLigado() {
		return iphoneLigado;
	}

	public void setIphoneLigado(boolean iphoneLigado) {
		this.iphoneLigado = iphoneLigado;
	}

	public boolean getSinalRede() {
		return sinalRede;
	}

	public void setSinalRede(boolean sinalRede) {
		this.sinalRede = sinalRede;
	}

	public boolean getTocandoMusica() {
		return tocandoMusica;
	}

	public void setTocandoMusica(boolean tocandoMusica) {
		this.tocandoMusica = tocandoMusica;
	}
	
	
	
	public boolean getEmligacao() {
		return emligacao;
	}

	public void setEmligacao(boolean emligacao) {
		this.emligacao = emligacao;
	}

	public boolean getSinalInternet() {
		return sinalInternet;
	}

	public void setSinalInternet(boolean sinalInternet) {
		this.sinalInternet = sinalInternet;
	}
	public boolean getNavegadorAberto() {
		return navegadorAberto;
	}

	public void setNavegadorAberto(boolean navegadorAberto) {
		this.navegadorAberto = navegadorAberto;
	}	
	
	public void ligarIphone() {
		this.setIphoneLigado(true);
		System.out.println("iphone foi  ligado ");
		
	}
	
	
	public void tocarMusica() {
		if(this.getIphoneLigado()) {
			this.setTocandoMusica(true);
			System.out.println("tocar Musica");
		}
		else
			
			System.out.println("primeiro e preciso ligar o  Iphone");
		}
		public void pausarMusica() {
			if(this.getIphoneLigado() && this.getTocandoMusica()) {
				
				System.out.println(" Musica pausada");
				this.setTocandoMusica(false);
			}
			
		
		
	}

		public void selecionaMusica() {
			if(this.getIphoneLigado() &&  !this.getTocandoMusica() ) {

				System.out.println("nova musica selecionada");
				this.setTocandoMusica(true);
				
					}
			
			}
		public void conectarRede() {
			
			this.setSinalRede(true);
			System.out.println("A rede foi conectada");
		}
		public void emligacao() {
			this.setEmligacao(false);
			
		}
		public void fazerLigacao() {
			if(this.getIphoneLigado() && this.getSinalRede()) {
				System.out.println("fazer ligação");
				this.setEmligacao(true);
				System.out.println("ligacao em andamento");
				this.setEmligacao(false);
				System.out.println("ligacao encerrada");
				
				
			}
			}
		public void chamando() {
			this.setChamando(true);
			
		}

		public boolean getChamando() {
			return chamando;
		}

		public void setChamando(boolean chamando) {
			this.chamando = chamando;
		}
		public void atendendoLigacao() {
			if(this.getIphoneLigado() &&  this.getChamando() && this.getSinalRede() ) {
				
				System.out.println("atender a ligação");
				this.setEmligacao(true);
				System.out.println("ligacao  atendida");
				this.setEmligacao(false);
				System.out.println("ligacao encerrada");
			}
			
		}
		public void correidoVoz() {
			
			if(this.getIphoneLigado() &&  this.getChamando() && this.getSinalRede() ) {
				
				System.out.println("ligar para correio de voz");
				this.setEmligacao(true);
				System.out.println("ligacao atendia pelo correio de voz");
				this.setChamando(false);
				System.out.println("ligacao encerrada");
			} 
			
		}
		public void ligarintert() {
			this.setSinalInternet(true);
			System.out.println("A internet esta conectada!");
		}
		public void abrirNavegador() {
			this.setNavegadorAberto(true);
		}
		
		public void abirPaginaInternet() {
			if(this.getIphoneLigado() && this.getSinalInternet()&& this.getNavegadorAberto()) {
				System.out.println("exibir pagina internet");}
				
				
			
			
			
			}
		
	
		public void adicionarNovaaba() {
			if(this.getIphoneLigado() && this.getSinalInternet()&& this.getNavegadorAberto()) {
			 System.out.println("abrir nova pagina na internet");}
			if(this.getSinalInternet()== false) {
				System.out.println("favor conectar a internet");
				if(this.getNavegadorAberto()==false) {
					System.out.println("favor abir o nagegador");
				}
				
			}
			
			
			 
			
				
			
			
			
			
		}
		public void atualizarPagina() {
			if(this.getIphoneLigado() && this.getSinalInternet()&& this.getNavegadorAberto()) {
				
				System.out.println("pagina web atualizada");
				if(this.getSinalInternet()== false) {
					System.out.println("favor conectar a internet");
					if(this.getNavegadorAberto()==false) {
						System.out.println("favor abir o nagegador");
					}
					}
			}
			
			
		} 
		
		
				}
			
		
		
