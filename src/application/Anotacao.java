package application;

@Cabecalho(
 instituicao = "MRLRSX",
 projeto = "Sistema de Avalições",
 dataCriacao = "19/09/2022",
 criador = "LUCAS ROCHA DOS SANTOS",
 revisao = "2"
 
)

@ErrosCorrigidos( erros = {"001", "002", "003", "004"})

public class Anotacao {
 
	@Deprecated
	public void anotar() {}
}
