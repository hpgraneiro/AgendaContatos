
package visao;

import controle.TipoContatoControle;
import javax.swing.table.DefaultTableModel;


public class ContatoVisao extends FormPadrao{
    
    public ContatoVisao(){
        setTitle("Cadastro de Contatos");
        
    }

    @Override
    public void inicializarComponentes() {
         
    }
   
    
    @Override
    public void salvarVisao() {
    }

    @Override
    public void criarTabela() {
        tabela = utilTabela.criarTabela(
                jpnConsulta,
                new Object[] {60, 650},
                new Object[] {"centro", "esquerda"},
                new Object[] {"ID", "Descricao"}
        );
        modelo = (DefaultTableModel) tabela.getModel();
    }

    @Override
    public void consultaVisao() {
        
    }

    @Override
    public void atualizarFormulario() {
        
    }

    @Override
    public void excluirVisao() {
        
    }
}
